package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import Dao.CutleryDao;

public class MenuItem {
    public String id;
    public String name;
    public String category;
    public float price;
    public int quantity;
    public List<MenuItemCutlery> MenuItemCutlery = new ArrayList<MenuItemCutlery>();

    private CutleryDao cutleryDao;

    public MenuItem() {
        id = UUID.randomUUID().toString();
        cutleryDao = new CutleryDao();
    }
    
    /**
     * Adds cutlery to the menuitem object
     * @param name name of the cutlery
     * @param quantity quantity of the cutlery
     */
    public void AddCutlery(String name, int quantity) {
        Optional<String> optionalCutleryId = cutleryDao.getId(name);
        if (! optionalCutleryId.isPresent())
        {
            throw new IllegalArgumentException("[MenuItem]: Cutlery name not valid/found"); 
        }
        if (quantity <= 0)
        {
            throw new IllegalArgumentException("[MenuItem]: cannot give quantity less than or equal to 0");
        }

        MenuItemCutlery menuItemCutlery = new MenuItemCutlery(optionalCutleryId.get(), id, quantity);
        MenuItemCutlery.add(menuItemCutlery);
    }
}