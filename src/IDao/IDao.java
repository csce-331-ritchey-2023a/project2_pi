package src.IDao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    /**
     * Converts Result Set to Class Object T
     * @param rs - Result Set
     * @return Object with content of Result Set
     */
    T ConvertResultSet(ResultSet rs); 

    /**
     * Gets object from database given id
     * @param id - object id
     * @return Optional object containing object if object found
     */
    Optional<T> get(String id);
   
    /**
     * Gets all the objects in the database
     * @return List containing all the objects in the database
     */
    List<T> getAll();
   
    /**
     * Gets Id of object given name
     * @param name - name of object 
     * @return Optional containing string id if object found
     */
    Optional<String> getId(String name);

    /**
     * Adds object to database 
     * @param entity
     */
    void add(T entity);

    /**
     * Updates object in database
     * @param entity
     */
    void update(T entity);

    /**
     * Deletes object from database
     * @param entity
     */
    void delete(T entity);

    // /**
    //  * Removes sub entity from database (MenuItemCutlery, OrderedMenuItem, etc)
    //  * @param entity
    //  */
    // void removeDependency(T entity);

    // /**
    //  * Gets historic sales data
    //  */
    // XYSeries getHistory();

// SELECT DATE(o.date_time) AS sale_date, SUM(om.quantity) AS quantity_sold
// FROM orders o
// JOIN ordered_menu_item om ON o.id = om.order_id
// JOIN menu_item mi ON om.menuitem_id = mi.id
// WHERE mi.name = 'pita'
// GROUP BY sale_date;

}