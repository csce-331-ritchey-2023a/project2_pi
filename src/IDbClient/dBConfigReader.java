package src.IDbClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class dBConfigReader {
    private static Properties _properties;
    
    public String link;
    public String username;
    public String password;

    public dBConfigReader()
    {
        try {
            _properties = new Properties();
            FileInputStream input = new FileInputStream("db.conf");
            _properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        link = _properties.getProperty("link");
        username = _properties.getProperty("username");
        password = _properties.getProperty("password");
    }
}
