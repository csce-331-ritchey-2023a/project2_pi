package src.Models;

public class MenuItemCutlery {
    public String menuItemId;
    public String cutleryId;
    public int quantity;
    
    public MenuItemCutlery(String _menuItemId, String _cutleryId, int _quantity)
    {
        menuItemId = _menuItemId;
        cutleryId = _cutleryId;
        quantity = _quantity;
    }
}