package test.daoTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import Dao.Inventory;
import Dao.MenuItemDao;
import Models.MenuItem;

public class inventoryTest {
    private Inventory inventory;

    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
    }
    
    @Test
    public void testExcessReport() throws SQLException {
        inventory = new Inventory();
        /* Create new menu item to test */
        MenuItemDao menuItemDao = new MenuItemDao();
        MenuItem testMenuItem = new MenuItem();
        testMenuItem.name = "beef";
        testMenuItem.price = 2.2f;
        testMenuItem.quantity = 2000;
        menuItemDao.add(testMenuItem);

        // actual test
        ResultSet rs = inventory.getExcessReport("03/01/2023");
        assertNotNull(rs);
        assertTrue(rs.next());
        
        menuItemDao.delete(testMenuItem);
    }
}