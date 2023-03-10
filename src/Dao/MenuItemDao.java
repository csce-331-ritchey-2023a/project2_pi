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

    // init client connection
    public MenuItemDao() {
        dbClient = new DbClient();
        dbClient.connect();
    }
    
    // cleans up before object is destructed  
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
            menuItem.quantity = rs.getInt("quantity");
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

        try {
            // if exists, then return object inside Optional container
            if (rs.next())
            {
                MenuItem menuItem = ConvertResultSet(rs);
                return Optional.of(menuItem);
            }
            else
            {
                System.out.println("[MenuItemDao] Menu Item with id " + id + " not found");
                return Optional.empty();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
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
    public Optional<String> getId(String name) {
        String query = String.format("SELECT * FROM menu_item WHERE name='%s';", name);
        ResultSet rs = dbClient.executeQuery(query); 
        try {
            String id = "";
            
            // if result set has any rows
            if (rs.next())
            {
                id = rs.getString("id");
            }
            return Optional.of(id);
        } catch (SQLException e) { 
            System.out.println("[MenuItemDao]: Given query did not return id");
            return Optional.empty();
        }
    }
   
    @Override
    public ResultSet getHistory(String id) {
        String query = String.format(
            "SELECT DATE_TRUNC('day', o.date_time) as day, SUM(omi.quantity) as total_sales" +
            "FROM orders o" +
            "JOIN ordered_menu_item omi ON omi.order_id = o.id" +
            "JOIN menu_item mi ON mi.id = omi.menuitem_id" +
            "WHERE mi.id = '%s'" + 
            "AND o.date_time >= CURRENT_DATE - INTERVAL '6 months' -- filter data from the last 6 months" +
            "GROUP BY day" +
            "ORDER BY day ASC;",
            id
        ); 
        
        ResultSet rs = dbClient.executeQuery(query); 
        return rs;
    }

    @Override
    public void add(MenuItem menuItem) {
        // Add MenuItem to table
        String query = String.format(
            "INSERT INTO menu_item(id, name, quantity, price, category) VALUES ('%s', '%s', %d, %f, '%s');", 
            menuItem.id, menuItem.name, menuItem.quantity, menuItem.price, menuItem.category); 
        
        dbClient.executeQuery(query);

        for (int i = 0; i < menuItem.MenuItemCutlery.size(); i++)
        {
            // insert into MenuItemCutlery table
            query = String.format(
                "INSERT INTO menu_item_cutlery(menu_item_id, cutlery_id, quantity) VALUES ('%s', '%s', %d);",
                menuItem.MenuItemCutlery.get(i).menuItemId, menuItem.MenuItemCutlery.get(i).cutleryId, menuItem.MenuItemCutlery.get(i).quantity 
            );
        }
    }

    @Override
    public void update(MenuItem menuItem) {
        String query = String.format(
            "UPDATE menu_item SET name = '%s', quantity = %d, price = %f, category = '%s' WHERE id = '%s';", 
            menuItem.name, menuItem.quantity, menuItem.price, menuItem.category, menuItem.id); 
        
        
        for (int i = 0; i < menuItem.MenuItemCutlery.size(); i++)
        {
            // Update Cutlery 
            query = String.format(
                "UPDATE menu_item_cutlery SET quanitity %d WHERE menu_item_id = '%s' AND cutlery_id = '%s';",
                menuItem.MenuItemCutlery.get(i).quantity ,menuItem.MenuItemCutlery.get(i).menuItemId, menuItem.MenuItemCutlery.get(i).cutleryId
            );
            
            dbClient.executeQuery(query);
        }    
    }

    @Override
    public void delete(MenuItem menuItem) {
        String query = String.format("DELETE FROM menu_item WHERE id = '%s';", menuItem.id);
        dbClient.executeQuery(query);
     
        // Delete from menu_item_cutlery 
        query = String.format(
            "DELETE FROM menu_item_cutlery WHERE menu_item_id = '%s';",
            menuItem.id
        );
        dbClient.executeQuery(query);
    }

    /**
     * deletes cutlery dependency from menu_item_cutlery table
     * @param menuItemId
     * @param cutleryId
     */
    public void deleteCutlery(String menuItemId, String cutleryId) {
        String query = String.format(
            "DELETE FROM menu_item_cutlery WHERE menu_item_id = '%s' AND cutlery_id = '%s';",
            menuItemId, cutleryId 
        );

        dbClient.executeQuery(query);
    }
}
