package src.IDao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;


public interface IDao<T> {
    T ConvertResultSet(ResultSet rs); 

    Optional<T> get(String id);
    
    List<T> getAll();
    
    Optional<Integer> getId(String name);

    void add(T entity);

    void update(T entity);

    void delete(T entity);
}