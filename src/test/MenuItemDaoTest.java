package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.After;

import Dao.MenuItemDao;
import Models.MenuItem;

public class MenuItemDaoTest {

    private MenuItemDao menuItemDao;

    @BeforeEach
    public void setUp() throws Exception {
        menuItemDao = new MenuItemDao();
    }

    @After
    public void tearDown() throws Exception {
        if (menuItemDao.dbClient.connection != null) {
            menuItemDao.dbClient.disconnect();
        }
        
        Optional<MenuItem> testMenuItem= menuItemDao.get("3");
        if (testMenuItem.isPresent())
        {
            menuItemDao.delete(testMenuItem.get());
        }
    }

    @Test
    public void testGetId() { 
        // Test for existing cutlery
        Optional<String> optionalId = menuItemDao.getId("pita");
        Assertions.assertTrue(optionalId.isPresent());
        Assertions.assertEquals("7278c370-b7a8-11ed-b486-00155d0752bf", optionalId.get());
    }

    @Test
    public void testGet() {
        Optional<MenuItem> menuItem = menuItemDao.get("7278c370-b7a8-11ed-b486-00155d0752bf");
        assertTrue(menuItem.isPresent());
        assertEquals("pita", menuItem.get().name);
    }

    @Test
    public void testGetAll() {
        List<MenuItem> menuItems = menuItemDao.getAll();
        assertTrue(menuItems.size() >= 24);
    }

    @Test
    public void testGetByCategory() {
        List<MenuItem> menuItems = menuItemDao.getByCategory("base");

        assertNotNull(menuItems);
        assertTrue(menuItems.size() > 0);

        for(MenuItem item : menuItems) {
            assertEquals("base", item.category);
        }
    }

    @Test
    public void testAddAndUpdate() {
        MenuItem menuItem = new MenuItem();
        menuItem.id = "3";
        menuItem.name = "test";
        menuItem.quantity = 69;
        menuItem.price = 0f;
        menuItem.category = "base";
        menuItemDao.add(menuItem);

        Optional<MenuItem> addedMenuItem = menuItemDao.get("3");
        assertTrue(addedMenuItem.isPresent());
        assertEquals("test", addedMenuItem.get().name);
        
        menuItem.quantity = 420;
        menuItemDao.update(menuItem);

        Optional<MenuItem> updatedMenuItem = menuItemDao.get("3");
        assertTrue(updatedMenuItem.isPresent());
        assertEquals("test", updatedMenuItem.get().name);
        assertEquals(420, updatedMenuItem.get().quantity);
        assertEquals(0f, updatedMenuItem.get().price, 0.001f);
        assertEquals("base", updatedMenuItem.get().category);

        menuItemDao.delete(menuItem);
    }

    @Test
    public void testDelete() { 
        Optional<MenuItem> testMenuItem= menuItemDao.get("3");
        if (testMenuItem.isPresent())
        {
            menuItemDao.add(testMenuItem.get());
        }

        MenuItem menuItem = new MenuItem();
        menuItem.id = "3";
        menuItemDao.delete(menuItem);

        Optional<MenuItem> deletedMenuItem = menuItemDao.get("3");
        assertFalse(deletedMenuItem.isPresent());
    }

}