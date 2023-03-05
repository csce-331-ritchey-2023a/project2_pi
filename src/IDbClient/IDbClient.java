package src.IDbClient;

public interface IDbClient {
    public void connect();
    public void disconnect();
    public void executeQuery();
}