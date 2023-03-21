package test.daoTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import Dao.CutleryDao;
import Models.Cutlery;

public class cutleryDaoTest {
    private CutleryDao cutleryDao;

    @BeforeEach
    public void setUp() {
        cutleryDao = new CutleryDao();
    }

    @Test 
    public void testGetId() {
        // Test for existing cutlery
        Optional<String> optionalId = cutleryDao.getId("bowl");
        Assertions.assertTrue(optionalId.isPresent());
        Assertions.assertEquals("15b4c496-b7ca-11ed-8be6-00155d0752bf", optionalId.get());
    }

    @Test
    public void testGet() {
        /* Test for existing cutlery */
        String id = cutleryDao.getId("bowl").get();

        // test if it got anything at all
        Optional<Cutlery> optionalCutlery = cutleryDao.get(id);
        Assertions.assertTrue(optionalCutlery.isPresent());

        // test to see if we got the right object 
        Cutlery cutlery = optionalCutlery.get();

        Assertions.assertEquals(id, cutlery.id);
        Assertions.assertEquals("bowl", cutlery.name);
        Assertions.assertEquals(2000, cutlery.quantity);

        /* Test for non-existent cutlery */
        Optional<Cutlery> optionalCutlery2 = cutleryDao.get("100");
        Assertions.assertTrue(optionalCutlery2.isEmpty());
    }

    @Test
    public void testGetAll() {
        List<Cutlery> cutleryList = cutleryDao.getAll();
        Assertions.assertFalse(cutleryList.isEmpty());
        Assertions.assertTrue(cutleryList.size() >= 5);
    }

    @Test
    public void testAddAndUpdate() {
        // add cutlery
        Cutlery cutlery = new Cutlery();
        cutlery.id = "3";
        cutlery.name = "test";
        cutlery.quantity = 69;
        cutleryDao.add(cutlery);

        // make sure the cutlery was added 
        Optional<Cutlery> optionalCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalCutlery.isPresent());
        Cutlery addedCutlery = optionalCutlery.get();
        Assertions.assertEquals(cutlery.id, addedCutlery.id);
        Assertions.assertEquals(cutlery.name, addedCutlery.name);
        Assertions.assertEquals(cutlery.quantity, addedCutlery.quantity);

        // update the cutlery object
        addedCutlery.quantity = 420;
        cutleryDao.update(addedCutlery);
        
        // make sure the cutlery object was updated
        Optional<Cutlery> optionalUpdatedCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalUpdatedCutlery.isPresent());
        Cutlery updatedCutlery = optionalUpdatedCutlery.get();
        Assertions.assertEquals(addedCutlery.quantity, updatedCutlery.quantity);
    }

    @Test
    public void testDelete() {
        Cutlery cutlery = new Cutlery();
        cutlery.id = "3";
        cutlery.name = "test";
        cutlery.quantity = 420;

        cutleryDao.delete(cutlery);

        Optional<Cutlery> optionalDeletedCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalDeletedCutlery.isEmpty());
    }
}