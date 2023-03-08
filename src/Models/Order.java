package src.Models;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import src.IDao.MenuItemDao;

public class Order {
    public String id;
    public String date;
    public float total_price;
    public List<OrderedMenuItem> OrderedMenuItems;

    private MenuItemDao menuItemDao;

    public Order() {
        id = UUID.randomUUID().toString();
        menuItemDao = new MenuItemDao();
    } 

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
    }
}