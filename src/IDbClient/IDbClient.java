package src.IDbClient;

import java.sql.ResultSet;

public interface IDbClient {

    /** 
     * Creates connection with database
    */
    public void connect();

    /**
     * Disconnects client from database
     */
    public void disconnect();

    /**
     * Executes query in database 
     * @param query 
     * @return ResultSet if query returns values, else null
     */
    public ResultSet executeQuery(String query);
}