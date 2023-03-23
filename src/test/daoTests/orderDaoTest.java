package test.daoTests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import Dao.OrdersDao;
import Models.Order;

public class orderDaoTest {
    private OrdersDao ordersDao;
    
    @BeforeAll
    public void setup() {
        ordersDao = new OrdersDao();
    }

    @Test 
    public void testGet() {
        Optional<Order> optionalOrder = ordersDao.get("fa9a85ba-bb07-11ed-9982-00155deb6281");
        
        // make sure it exists 
        assertTrue(optionalOrder.isPresent());

        Order order = optionalOrder.get();

        // check price of order
        assertEquals(order.total_price, 8.34f);

        // make sure order is not empty
        assertFalse(order.OrderedMenuItems.isEmpty());
    }

    @Test
    public void testGetAll() {
        List<Order> orders = ordersDao.getAll();
        assertFalse(orders.isEmpty());
    }

    @Test
    public void testAdd() { 
        
    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDelete() {

    }
}
