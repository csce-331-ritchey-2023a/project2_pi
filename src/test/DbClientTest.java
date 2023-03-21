package src.test;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

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
        String uuid = UUID.randomUUID().toString();
        String query = String.format("INSERT INTO cutlery_test(id, name, quantity) VALUES (%s, %s, %d)", uuid, "test", 2);  
        rs = dbClient.executeQuery(query);
        assertNull(rs);

        query = String.format("DELETE FROM cutlery_test WHERE id = '%s'", uuid);
        rs = dbClient.executeQuery(query);
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
