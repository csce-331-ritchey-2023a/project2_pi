package Dao;

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
        menuItemDao = new MenuItemDao();
        cutleryDao = new CutleryDao();
    }
    
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
        if (entity instanceof MenuItem) 
        {
            menuItemDao.add((MenuItem) entity);
        }
        else if (entity instanceof Cutlery)
        {
            cutleryDao.add((Cutlery) entity);
        }
    }

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
