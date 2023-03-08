package src.Models;
import java.util.UUID;

public class Cutlery {
    public String id;
    public String name;
    public int quantity;

    public Cutlery() {
        id = UUID.randomUUID().toString();
    }    
}
