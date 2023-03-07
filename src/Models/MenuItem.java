package src.Models;

import java.util.List;
import java.util.UUID;

public class MenuItem {
    public String id;
    public String name;
    public String category;
    public float price;
    public int quanitity;
    public List<MenuItemCutlery> MenuItemCutlery;

    public MenuItem() {
        id = UUID.randomUUID().toString();
    }
}