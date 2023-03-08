package src.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.IDbClient.dBConfigReader;

public class dBConfigReaderTest {
    private dBConfigReader configReader;

    @Before
    public void setUp() {
        configReader = new dBConfigReader();
    }

    @Test
    public void testLink() {
        assertEquals("jdbc:postgresql://csce-315-db.engr.tamu.edu/csce315331_pi", configReader.link);
    }

    @Test
    public void testUsername() {
        assertEquals("csce315331_pi_master", configReader.username);
    }

    @Test
    public void testPassword() {
        assertEquals("3.1415", configReader.password);
    }
}