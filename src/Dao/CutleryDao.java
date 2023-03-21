package src.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.IDbClient.DbClient;
import src.Models.Cutlery;

public class CutleryDao implements IDao<Cutlery>{ 
    public DbClient dbClient;    

    // init client connection
    public CutleryDao() {
        dbClient = new DbClient();
        dbClient.connect();
    }
    
    // ensure client is disconnected before object is destructed
    protected void finalize() {
        if (dbClient.connection != null) {
            dbClient.disconnect();
        }
    }

    @Override
    public Cutlery ConvertResultSet(ResultSet rs) {
        Cutlery cutlery = new Cutlery();
        try {
            cutlery.id = rs.getString("id"); 
            cutlery.name = rs.getString("name");
            cutlery.quantity = rs.getInt("quantity");
        } catch (SQLException e) {
            System.out.println("[CutleryDao]: Given Result Set Could Not Be Converted to Cutlery Object");
        } 

        return cutlery;
    }

    @Override
    public Optional<Cutlery> get(String id) {
        String query = String.format("SELECT * FROM cutlery WHERE id = '%s';", id);
        ResultSet rs = dbClient.executeQuery(query);

        try {
            // if exists, then return object inside Optional container
            if (rs.next()) {
                Cutlery cutlery = ConvertResultSet(rs);
                return Optional.of(cutlery);           
            }
            else 
            {
                System.out.println("[CutleryDao] Cutlery with id " + id + " not found");
                return Optional.empty();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    } 

    @Override
    public List<Cutlery> getAll() {
        String query = String.format("SELECT * FROM cutlery;");
        ResultSet rs = dbClient.executeQuery(query);
        
        List<Cutlery> cutlery = new ArrayList<Cutlery>();
        
        try {    
            while (rs.next())
            {
                cutlery.add(ConvertResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cutlery;
    }
    
    @Override
    public Optional<String> getId(String name) {
        String query = String.format("SELECT * FROM cutlery WHERE name='%s';", name);
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
            System.out.println("[CutleryDao]: Given query did not return id");
            return Optional.empty();
        }
    }    

    @Override
    public ResultSet getHistory(String cutlery_id) {
        String query = String.format(
        "SELECT DATE_TRUNC('day', o.date_time) as day, SUM(mic.quantity * omi.quantity) as total_sales" +
        "FROM orders o" +
        "JOIN ordered_menu_item omi ON omi.order_id = o.id" +
        "JOIN menu_item mi ON mi.id = omi.menuitem_id" +
        "JOIN menu_item_cutlery mic ON mic.menu_item_id = mi.id" +
        "JOIN cutlery c ON c.id = mic.cutlery_id" +
        "WHERE c.id = '%s'" +
        "AND o.date_time >= CURRENT_DATE - INTERVAL '6 months' -- filter data from the last 6 months" +
        "GROUP BY day" +
        "ORDER BY day ASC;", cutlery_id);
        
        ResultSet rs = dbClient.executeQuery(query); 
        return rs; 
    }
 
    @Override
    public void add(Cutlery cutlery) {
        // Add Cutlery to table
        String query = String.format(
            "INSERT INTO cutlery(id, name, quantity) VALUES ('%s', '%s', %d)", 
            cutlery.id, cutlery.name, cutlery.quantity); 
        
        dbClient.executeQuery(query);
    }

    @Override
    public void update(Cutlery cutlery) {
        String query = String.format(
            "UPDATE cutlery SET name = '%s', quantity = %d WHERE id = '%s';", 
            cutlery.name, cutlery.quantity, cutlery.id); 
        
        dbClient.executeQuery(query);
    }

    @Override
    public void delete(Cutlery cutlery) {
        String query = String.format("DELETE FROM cutlery WHERE id = '%s';", cutlery.id);
        dbClient.executeQuery(query);
    }

    public void reduceQuantity(int quantity, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reduceQuantity'");
    }
}