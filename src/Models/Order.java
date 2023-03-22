package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Dao.MenuItemDao;

public class Order {
    public String id;
    public String date;
    public float total_price;
    public List<OrderedMenuItem> OrderedMenuItems = new ArrayList<OrderedMenuItem>();

    private MenuItemDao menuItemDao;

    public Order() {
        id = UUID.randomUUID().toString();
        menuItemDao = new MenuItemDao();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        date = currentDateTime.format(formatter);
    } 

    /**
     * Adds menu item to order
     * @param name name of menu item
     * @param quantity 
     */
    public void AddMenuItem(String name, int quantity) {
        Optional<String> optionalMenuItemId = menuItemDao.getId(name);
        if (! optionalMenuItemId.isPresent())
        {
            throw new IllegalArgumentException("[Order]: MenuItem name not valid/found"); 
        }
        if (quantity <= 0)
        {
            throw new IllegalArgumentException("[Order]: cannot give quantity less than or equal to 0");
        }

        OrderedMenuItem orderedMenuItem = new OrderedMenuItem(optionalMenuItemId.get(), id, quantity);
        OrderedMenuItems.add(orderedMenuItem);
        MenuItem addedMenuItem = menuItemDao.get(optionalMenuItemId.get()).get();
        total_price += addedMenuItem.price;
    }
}