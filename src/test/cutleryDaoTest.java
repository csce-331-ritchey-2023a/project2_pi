package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import src.IDao.CutleryDao;
import src.Models.Cutlery;

public class cutleryDaoTest {
    private CutleryDao cutleryDao;

    @BeforeEach
    public void setUp() {
        cutleryDao = new CutleryDao();
    }

    @Test
    public void testGet() {
        // Test for existing cutlery
        Optional<Cutlery> optionalCutlery = cutleryDao.get("1");
        Assertions.assertTrue(optionalCutlery.isPresent());
        Cutlery cutlery = optionalCutlery.get();
        Assertions.assertEquals("1", cutlery.id);
        Assertions.assertEquals("Fork", cutlery.name);
        Assertions.assertEquals(10, cutlery.quantity);

        // Test for non-existent cutlery
        Optional<Cutlery> optionalCutlery2 = cutleryDao.get("100");
        Assertions.assertTrue(optionalCutlery2.isEmpty());
    }

    @Test
    public void testGetAll() {
        List<Cutlery> cutleryList = cutleryDao.getAll();
        Assertions.assertFalse(cutleryList.isEmpty());
        Assertions.assertTrue(cutleryList.size() >= 2);
    }

    @Test
    public void testAddAndUpdate() {
        Cutlery cutlery = new Cutlery();
        cutlery.id = "3";
        cutlery.name = "Knife";
        cutlery.quantity = 20;

        cutleryDao.add(cutlery);

        Optional<Cutlery> optionalCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalCutlery.isPresent());
        Cutlery addedCutlery = optionalCutlery.get();
        Assertions.assertEquals(cutlery.id, addedCutlery.id);
        Assertions.assertEquals(cutlery.name, addedCutlery.name);
        Assertions.assertEquals(cutlery.quantity, addedCutlery.quantity);

        addedCutlery.quantity = 30;
        cutleryDao.update(addedCutlery);

        Optional<Cutlery> optionalUpdatedCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalUpdatedCutlery.isPresent());
        Cutlery updatedCutlery = optionalUpdatedCutlery.get();
        Assertions.assertEquals(addedCutlery.quantity, updatedCutlery.quantity);
    }

    @Test
    public void testDelete() {
        Cutlery cutlery = new Cutlery();
        cutlery.id = "3";
        cutlery.name = "Knife";
        cutlery.quantity = 20;

        cutleryDao.add(cutlery);

        Optional<Cutlery> optionalCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalCutlery.isPresent());

        cutleryDao.delete(cutlery);

        Optional<Cutlery> optionalDeletedCutlery = cutleryDao.get("3");
        Assertions.assertTrue(optionalDeletedCutlery.isEmpty());
    }
}