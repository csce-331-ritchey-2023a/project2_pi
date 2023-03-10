package src.Dao;

import java.sql.ResultSet;

import src.IDbClient.DbClient;

public class Inventory{
    private DbClient dbClient;
    
    public ResultSet get() {
        ResultSet rs = dbClient.executeQuery(
            "SELECT id, name, quantity" +
            "FROM cutlery" +
            "UNION" +
            "SELECT id, name, quantity" +
            "FROM menu_item;"
        );

        return rs;  
    }

    public void add(Object entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void update(Object entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public void delete(Object entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
