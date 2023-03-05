package src.IDbClient;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbClient implements IDbClient {
    private Connection _connection;

    private String _dbLink;
    private String _dbUser;
    private String _dbPassword;
    
    public DbClient() {
        dBConfigReader configReader = new dBConfigReader();
        _dbLink = configReader.link;
        _dbUser = configReader.username;
        _dbPassword = configReader.password;
    }

    @Override
    public void connect() {
        try {
            _connection = DriverManager.getConnection(_dbLink, _dbUser, _dbPassword);
            System.out.println("[dBClient] Connected to database successfully.");
        } catch (SQLException e) {
            System.out.println("[dbClient] Error Connecting to database: " + e.getMessage());
        }
    }

    @Override
    public void disconnect() {
        try {
            if (_connection == null) 
            {
                System.out.println("[dbClient] Error Disconnecting: connection is null");
                return;
            }
            
            _connection.close();
            System.out.println("[dbClient] Disconnected from db");
        } catch (SQLException e) {
            System.out.println("[dbClient] Error Disconnecting: " + e.getMessage());
        }

    }

    @Override
    public ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = _connection.createStatement();
            boolean returnsResult = stmt.execute(query);
            
            System.out.println("[dbClient] query ran successfully");
            if (returnsResult)
            {
                rs = stmt.getResultSet();
            } 
            else 
            {
                int rowsAffected = stmt.getUpdateCount();
                System.out.println(rowsAffected + " rows affected");
            }
        } catch (SQLException e) {
            System.out.println("[dbClient] Error executing query: " + e.getMessage());
        }

        return rs;
    }  
}
