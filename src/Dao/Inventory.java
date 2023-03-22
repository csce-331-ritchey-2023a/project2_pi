package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
            "SELECT id, name, quantity " +
            "FROM cutlery " +
            "UNION " +
            "SELECT id, name, quantity " +
            "FROM menu_item;"
        );

        return rs;  
    }

    /**
     * gets restock report
     * @return
     */
    public ResultSet getRestockReport(){
        ResultSet rs = dbClient.executeQuery(
            "SELECT name " +
            "FROM cutlery " +
            "WHERE quantity < 1000 " +
            "UNION " +
            "SELECT name " +
            "FROM menu_item " + 
            "WHERE quantity < 1000;"
        );

        return rs; 
    }
   
    /**
     * gets excess report given start time
     * @param time
     * @return ReturnSet containing id, name
     */
    public ResultSet getExcessReport(String time) {
        String query = String.format(
            "SELECT mi.name, SUM(om.quantity) as total_quantity, mi.quantity as initial_quantity " +
            "FROM menu_item mi " +
            "JOIN ordered_menu_item om ON om.menuitem_id = mi.id " +
            "JOIN orders o ON o.id = om.order_id " +
            "WHERE o.date_time >= '%s' AND o.date_time <= CURRENT_TIMESTAMP " +
            "GROUP BY mi.id " +
            "HAVING (SUM(om.quantity) / mi.quantity) < 0.1;", time);
        
        ResultSet rs = dbClient.executeQuery(query);
        
        return rs;
    }

    /**
     * gets the total sales for the day
     * @return float with the total sales for the day
     */
    public float getXReport() {
        float totalSales = 0.0f; // Initialize totalSales as a float

        try {
            ResultSet rs = dbClient.executeQuery(
                "SELECT ROUND(SUM(total_price)::numeric, 2) AS total_sales " +
                "FROM orders " +
                "WHERE DATE(date_time) = CURRENT_DATE; "
            );

            if (rs.next()) {
                totalSales = rs.getFloat("total_sales"); // Get the "total_sales" column value as a float
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalSales;
    }

    /**
     * gets historical sales data
     * @return ResultSet with columns (day, total_sales)
     */
    public ResultSet getZReport() {
        ResultSet rs = dbClient.executeQuery(
            "SELECT DATE(date_time) AS day, ROUND(SUM(total_price)::numeric, 2) AS total_sales " +
            "FROM orders " +
            "GROUP BY DATE(date_time) " +
            "ORDER BY DATE(date_time) DESC;"
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