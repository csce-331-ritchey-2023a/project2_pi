package src.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.IDbClient.DbClient;
import src.Models.Cutlery;
import src.Models.MenuItem;
import src.Models.Order;
import src.Models.OrderedMenuItem;

public class OrdersDao implements IDao<Order> {

    public DbClient dbClient; 

    // init client connection
    public OrdersDao() {
        dbClient = new DbClient();
        dbClient.connect();
    }
    
    // make sure client is disconnected before we throw away obj
    protected void finalize() {
        if (dbClient.connection != null) {
            dbClient.disconnect();
        }
    }

    @Override
    public Order ConvertResultSet(ResultSet rs) {
        Order order = new Order();
        try{
            order.id = rs.getString("id");
            order.date = rs.getString("date");
            order.total_price = rs.getFloat("price");

        } catch (SQLException e){
            System.out.println("[MenuItemDao]: Given Result Set Could Not Be Converted to Order Item");
        }

        return order;

    }

    @Override
    public Optional<Order> get(String id) {
        String query = String.format("SELECT * FROM orders WHERE name='%s';", id);
        ResultSet rs = dbClient.executeQuery(query);

        try {
            // if exists, then return object inside Optional container
            if (rs.next()) {
                Order order = ConvertResultSet(rs);

                // populate ordered menu item
                query = String.format("SELECT * FROM ordered_menu_item WHERE order_id = '%s';", id);
                ResultSet orderedMenuItemRs = dbClient.executeQuery(query);
                while (orderedMenuItemRs.next())
                {
                    String menuItem_id = orderedMenuItemRs.getString("cutlery_id");
                    int quantity = orderedMenuItemRs.getInt("quantity"); 
                    order.OrderedMenuItems.add(new OrderedMenuItem(menuItem_id, id, quantity));
                }
                return Optional.of(order);           
            }
            else 
            {
                System.out.println("[OrdersDao] Order with id " + id + " not found");
                return Optional.empty();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Order> getAll() {
       String query = String.format("SELECT * FROM orders;");
       ResultSet rs = dbClient.executeQuery(query);

       List<Order> orders = new ArrayList<Order>();
       try{
        // while orders still exist
        while (rs.next()){
            orders.add(ConvertResultSet(rs));
        }
       }catch(SQLException e){
            e.printStackTrace();
       }

       return orders;
    }

    @Override
    public Optional<String> getId(String name) {
        String query = String.format("SELECT * FROM menu_item WHERE name = '%s';",name);
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
            System.out.println("[OrderDao]: Given query did not return id");
            return Optional.empty();
        }
    }   

    @Override
    public ResultSet getHistory(String id, String interval) {   
        throw new UnsupportedOperationException("Unimplemented method 'getHistory'");
    }

    @Override
    public void add(Order order) {
       String query = String.format("INSERT INTO orders(id, date_time, total_price) VALUES ('%s', '%s', %f);", order.id, order.date, order.total_price);

       dbClient.executeQuery(query);
        
        MenuItemDao menuItemDao = new MenuItemDao();
        CutleryDao cutleryDao = new CutleryDao();
        for(int i = 0; i < order.OrderedMenuItems.size(); i++)
        {
            query = String.format("INSERT INTO OrderedMenuItems(order_id, menu_item_id, quantity) VALUES ('%s', '%s', %d);", order.OrderedMenuItems.get(i).orderId, order.OrderedMenuItems.get(i).menuItemId, order.OrderedMenuItems.get(i).quantity);
            dbClient.executeQuery(query);

            // reduce quantity
            Optional<MenuItem> optionalMenuItem = menuItemDao.get(order.OrderedMenuItems.get(i).menuItemId); 
            if (optionalMenuItem.isPresent())
            {
                // update menu item quantity
                MenuItem menuItem = optionalMenuItem.get(); 
                menuItem.quantity -= order.OrderedMenuItems.get(i).quantity;
                menuItemDao.update(menuItem);

                // update cutlerly 
                for (int j = 0; j < menuItem.MenuItemCutlery.size(); j++)
                {
                    String cultleryId = menuItem.MenuItemCutlery.get(j).cutleryId;
                    Optional<Cutlery> optionalCutlery = cutleryDao.get(cultleryId);
                    Cutlery cutlery = optionalCutlery.get();
                    cutlery.quantity -= menuItem.MenuItemCutlery.get(j).quantity;
                    cutleryDao.update(cutlery);
                }
            }
            else 
            {
                System.out.println("[OrderDao]: Menu Item in order does not exist");
            }
        };
        System.out.println("[OrderDao]: Successfully added order");
    }

    @Override
    public void update(Order order) {
        String query = String.format("UPDATE Orders SET date = '%s', total_price = %f WHERE id = '%s';", order.date, order.total_price, order.id);
        dbClient.executeQuery(query);
 
        for (int i = 0; i < order.OrderedMenuItems.size(); i++)
        {
            // Update Cutlery 
            query = String.format(
                "UPDATE ordered_menu_item SET quanitity %d WHERE menu_item_id = '%s' AND order_id = '%s';",
                order.OrderedMenuItems.get(i).quantity, order.OrderedMenuItems.get(i).menuItemId, order.OrderedMenuItems.get(i).orderId
            );
            
            dbClient.executeQuery(query);
        }    
    }

    @Override
    public void delete(Order order) {
        String query = String.format("DELETE FROM orders WHERE id = '%s';", order.id);
        // delete all MenuItem Dependencies
        dbClient.executeQuery(query);
        
        // Delete all entries in ordered_menu_item  
        query = String.format("DELETE FROM ordered_menu_item WHERE order_id = '%s';", order.id);
        dbClient.executeQuery(query);
    }
}
