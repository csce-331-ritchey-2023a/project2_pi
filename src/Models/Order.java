package src.Models;

import java.util.List;
import java.util.UUID;

public class Order {
    public String id;
    public String date;
    public float total_price;
    public List<OrderedMenuItem> OrderedMenuItems;

   public Order() {
    id = UUID.randomUUID().toString();
   } 
}