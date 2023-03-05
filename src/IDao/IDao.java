package src.IDao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    /**
     * retrieves object from database
     * @param id
     * @return object if successfully found else null
     */ 
    Optional<T> get(String id);
    
    /**
     * retrieves all objects in dB  
     * @return list of all objects
     */
    List<T> getAll();
    
    /**
     * adds object t to DB 
     * @param t      
     */
    void add(T t);
    
    /**
     * updates object t in DB
     * @param t 
     * @param params - parameters that will be uptdated
     */
    void update(T t, String[] params);
    
    /**
     * deletes object t from DB
     * @param t
     */
    void delete(T t);
}