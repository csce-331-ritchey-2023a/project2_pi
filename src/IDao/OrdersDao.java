package src.IDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.IDbClient.DbClient;
import src.Models.Order;

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
    public void add(Order order) {
       String query = String.format("INSERT INTO orders(id, date, total_price) VALUES (%s, %s, %f);", order.id, order.date, order.total_price);

       dbClient.executeQuery(query);
        
       for(int i = 0; i < order.OrderedMenuItems.size(); i++)
       {
            query = String.format("INSERT INTO OrderedMenuItems(id, date, total_price) VALUES ('%s', '%s', %f);", order.id, order.date, order.total_price);
       };
    }

    @Override
    public void update(Order order) {
        String query = String.format("UPDATE OrderedMenuItems SET date = '%s', total_price = %f WHERE id = '%s';", order.date, order.total_price, order.id);
        
        dbClient.executeQuery(query);
    }

    @Override
    public void delete(Order order) {
        String query = String.format("DELETE FROM order_test WHERE id = '%s';", order.id);
        dbClient.executeQuery(query);
    } 
}
