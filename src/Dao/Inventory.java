package Dao;

import java.security.Timestamp;
import java.sql.ResultSet;

import IDbClient.DbClient;
import Models.Cutlery;
import Models.MenuItem;

public class Inventory{
    private DbClient dbClient;
    private MenuItemDao menuItemDao;
    private CutleryDao cutleryDao;

    public Inventory() 
    {
        dbClient = new DbClient();
        dbClient.connect();
        menuItemDao = new MenuItemDao();
        cutleryDao = new CutleryDao();
    }

    protected void finalize() {
        dbClient.disconnect();
    }
    
    /**
     * gets all inventory
     * @return ResultSet containing inventory table (id, name, quantity)
     */
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

    public ResultSet getRestockReport(){
        ResultSet rs = dbClient.executeQuery(
            "SELECT name" +
            "FROM cutlery" +
            "WHERE quantity < 1000" +
            "UNION" +
            "SELECT name" +
            "FROM menu_item" + 
            "WHERE quantity < 1000;"
        );

        return rs; 
    }
    
    public ResultSet getExcessReport(Timestamp timestamp){
        ResultSet rs = dbClient.executeQuery(
            "SELECT id, name, quantity" +
            "FROM cutlery" +
            "UNION" +
            "SELECT id, name, quantity" +
            "FROM menu_item" + 
            "WHERE quantity > 900" + 
            "AND o.date::timestamp + o.time::time WITH TIME ZONE BETWEEN ? AND NOW()::timestamp;", timestamp
        );

        return rs; 
    }

    /**
     * Add inventory item (cutlery / menuItem)
     * @param entity
     */
    public void add(Object entity) {
        if (entity instanceof MenuItem) 
        {
            menuItemDao.add((MenuItem) entity);
        }
        else if (entity instanceof Cutlery)
        {
            cutleryDao.add((Cutlery) entity);
        }
    }

    /**
     * Update menu item
     * @param entity
     */
    public void update(Object entity) { 
        if (entity instanceof MenuItem) 
        {
            menuItemDao.update((MenuItem) entity);
        }
        else if (entity instanceof Cutlery)
        {
            cutleryDao.update((Cutlery) entity);
        }
    }

    /**
     * Deletes inventory item 
     * @param entity
     */
    public void delete(Object entity) {
        if (entity instanceof MenuItem) 
        {
            menuItemDao.delete((MenuItem) entity);
        }
        else if (entity instanceof Cutlery)
        {
            cutleryDao.delete((Cutlery) entity);
        }
    }
}
