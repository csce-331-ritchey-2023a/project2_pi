package src.Models;

import java.util.List;

public class Order {
    public String id;
    public String date;
    public String time;
    public float total_price;
    public List<OrderedMenuItem> OrderedMenuItems;
}