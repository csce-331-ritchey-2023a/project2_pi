package src.IDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.IDbClient.DbClient;
import src.Models.MenuItem;

public class MenuItemDao implements IDao<MenuItem>{
    
    public DbClient dbClient;    

    public MenuItemDao() {
        dbClient = new DbClient("configs//db.conf");
        dbClient.connect();
    }
    
    protected void finalize() {
        if (dbClient.connection != null) {
            dbClient.disconnect();
        }
    }

    @Override
    public MenuItem ConvertResultSet(ResultSet rs) {
        MenuItem menuItem = new MenuItem();
        try {
            menuItem.id = rs.getString("id");
            menuItem.name = rs.getString("name");
            menuItem.price = rs.getFloat("price");
            menuItem.category = rs.getString("category");
        } catch (SQLException e) {
            System.out.println("[MenuItemDao]: Given Result Set Could Not Be Converted to Menu Item");
        } 

        return menuItem;
    }

    @Override
    public Optional<MenuItem> get(String id) {
        String query = String.format("SELECT * FROM menu_item WHERE id = '%s';", id);
        ResultSet rs = dbClient.executeQuery(query);

        if (rs == null)
        {
            System.out.println("[MenuItemDao] Menu Item with id " + id + " not found");
            return Optional.empty();
        }

        MenuItem menuItem = ConvertResultSet(rs);

        return Optional.of(menuItem);           
    }

    @Override
    public List<MenuItem> getAll() {
        String query = String.format("SELECT * FROM menu_item;");
        ResultSet rs = dbClient.executeQuery(query);
        
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        
        try {    
            while (rs.next())
            {
                menuItems.add(ConvertResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menuItems;
    }
   
    @Override
    public Optional<Integer> getId(String name) {
        String query = String.format("SELECT * FROM menu_item WHERE name='%s';", name);
        ResultSet rs = dbClient.executeQuery(query); 
        try {
            int id = rs.getInt("id");
            return Optional.of(id);
        } catch (SQLException e) { 
            System.out.println("[MenuItemDao]: Given query did not return id");
            return Optional.empty();
        }
    }

    @Override
    public void add(MenuItem menuItem) {
        // Add MenuItem to table
        String query = String.format(
            "INSERT INTO menu_item(id, name, quantity, price, category) VALUES (%s, %s, %d, %f, %s);", 
            menuItem.id, menuItem.name, menuItem.quanitity, menuItem.price, menuItem.category); 
        
        dbClient.executeQuery(query);

        for (int i = 0; i < menuItem.MenuItemCutlery.size(); i++)
        {
            // MenuItemCutlery DAO
        }
    }

    @Override
    public void update(MenuItem menuItem) {
        String query = String.format(
            "UPDATE menu_item SET name = %s, quantity = %d, price = %f, category = %s WHERE id = %s;", 
            menuItem.name, menuItem.quanitity, menuItem.price, menuItem.category, menuItem.id); 
        
        dbClient.executeQuery(query);
    }

    @Override
    public void delete(MenuItem menuItem) {
        String query = String.format("DELETE FROM cutlery_test WHERE id = '%s'", menuItem.id);
        dbClient.executeQuery(query);
    } 
}
