package src.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MenuItem {
    public String id;
    public String name;
    public String category;
    public float price;
    public int quantity;
    public List<MenuItemCutlery> MenuItemCutlery = new ArrayList<MenuItemCutlery>();

    public MenuItem() {
        id = UUID.randomUUID().toString();
    }
}