package test.daoTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import Dao.Inventory;
import Dao.MenuItemDao;
import Dao.OrdersDao;
import Models.MenuItem;
import Models.Order;

public class inventoryTest {
    private Inventory inventory = new Inventory();

    @Test
    public void testExcessReport() throws SQLException {
        MenuItem testMenuItem = new MenuItem();
        MenuItemDao testMenuItemDao = new MenuItemDao();
        
        /* Create new menu item to test */
        testMenuItem.name = "beef";
        testMenuItem.price = 2.2f;
        testMenuItem.quantity = 2000;
        testMenuItemDao.add(testMenuItem);
        
        ResultSet rs = inventory.getExcessReport("03/01/2023"); // need to go this far back since data stops in march
        assertNotNull(rs);
        assertTrue(rs.next()); 
        
        testMenuItemDao.delete(testMenuItem);
    }

    @Test
    public void testXReport() {
        OrdersDao ordersDao = new OrdersDao();
        Order order = new Order();
        order.AddMenuItem("pita", 1);
        order.AddMenuItem("meatball", 1);
        ordersDao.add(order);
        
        float sales = inventory.getXReport();
        assertEquals(order.total_price, sales);

        ordersDao.delete(order);
    }

    @Test
    public void testZReport() throws SQLException {
        ResultSet rs = inventory.getZReport();

        assertTrue(rs.next());
    }
}