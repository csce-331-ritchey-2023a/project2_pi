package test.daoTests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import Dao.OrdersDao;
import Models.Order;

public class orderDaoTest {
    private OrdersDao ordersDao;
    
    @BeforeEach
    public void setup() {
        ordersDao = new OrdersDao();
    }

    @Test 
    public void testGet() {
        
    }

    @Test
    public void testGetAll() {
    }


    @Test
    public void testAdd() { 
    }

    @Test
    public void testUpdate() {

    }
}
