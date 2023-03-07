package src.Models;

import java.util.List;

public class Order {
    public String id;
    public String date;
    public float total_price;
    public List<OrderedMenuItem> OrderedMenuItems;
}