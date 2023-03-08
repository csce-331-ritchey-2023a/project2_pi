package src.Models;

public class MenuItemCutlery {
    public String menuItemId;
    public String orderId;
    public int quantity;
    
    public MenuItemCutlery(String _menuItemId, String _orderID, int _quantity)
    {
        menuItemId = _menuItemId;
        orderId = _orderID;
        quantity = _quantity;
    }
}