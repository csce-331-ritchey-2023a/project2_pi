package src.IDbClient;

import java.sql.ResultSet;

public interface IDbClient {

    /** 
     * creates connection with database
    */
    public void connect();

    /**
     * disconnects client from database
     */
    public void disconnect();

    /**
     * 
     * @param query 
     * @return ResultSet if query returns values, else null
     */
    public ResultSet executeQuery(String query);
}