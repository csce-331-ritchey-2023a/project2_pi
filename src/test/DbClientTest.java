package src.test;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.IDbClient.DbClient;

class dbClientTest {
    private DbClient dbClient;
    
    @BeforeEach
    void setUp() {
        dbClient = new DbClient();
        dbClient.connect();
    }
    
    @AfterEach
    void tearDown() {
        dbClient.disconnect();
    }

    @Test
    void testExecuteQuery() throws SQLException {
        // Test query that returns results
        ResultSet rs = dbClient.executeQuery("SELECT * FROM menu_item_test;");
        assertNotNull(rs);
        
        // Test query that doesn't return results
        // rs = dbClient.executeQuery("");
        // assertNull(rs);
    }
    
    @Test
    void testConnect() throws SQLException {
        assertTrue(dbClient.connection.isValid(5));
    }
    
    @Test
    void testDisconnect() throws SQLException{
        dbClient.disconnect();
        assertFalse(dbClient.connection.isValid(5));
    }
}
