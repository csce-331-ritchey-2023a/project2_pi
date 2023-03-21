package src.Models;

public class OrderedMenuItem {
    public String menuItemId;
    public String orderId;
    public int quantity;

    public OrderedMenuItem(String _menuItemId, String _orderId, int _quantity) {
        menuItemId = _menuItemId;
        orderId = _orderId;
        quantity = _quantity;
    }
}