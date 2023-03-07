package src.IDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.IDbClient.DbClient;
import src.Models.Cutlery;

public class CutleryDao implements IDao<Cutlery>{ 
    public DbClient dbClient;    

    public CutleryDao() {
        dbClient = new DbClient("configs//db.conf");
        dbClient.connect();
    }
    
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
            System.out.println("[MenuItemDao]: Given Result Set Could Not Be Converted to Menu Item");
        } 

        return cutlery;
    }

    @Override
    public Optional<Cutlery> get(String id) {
        String query = String.format("SELECT * FROM cutlery WHERE id = '%s';", id);
        ResultSet rs = dbClient.executeQuery(query);

        if (rs == null)
        {
            System.out.println("[CutleryDao] Cutlery with id " + id + " not found");
            return Optional.empty();
        }

        Cutlery cutlery = ConvertResultSet(rs);

        return Optional.of(cutlery);           
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
    public Optional<Integer> getId(String name) {
        String query = String.format("SELECT * FROM cutlery WHERE name='%s';", name);
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
    public void add(Cutlery cutlery) {
        // Add Cutlery to table
        String query = String.format(
            "INSERT INTO cutlery(id, name, quantity) VALUES (%s, %s, %d)", 
            cutlery.id, cutlery.name, cutlery.quantity); 
        
        dbClient.executeQuery(query);
    }

    @Override
    public void update(Cutlery cutlery) {
        String query = String.format(
            "UPDATE menu_item SET name = %s, quantity = %d, price = %f, category = %s WHERE id = %s;", 
            cutlery.name, cutlery.quantity, cutlery.id); 
        
        dbClient.executeQuery(query);
    }

    @Override
    public void delete(Cutlery cutlery) {
        String query = String.format("DELETE FROM cutlery WHERE id = '%s';", cutlery.id);
        dbClient.executeQuery(query);
    }  
}