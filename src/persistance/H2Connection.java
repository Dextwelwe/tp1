package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {

    private static Connection connection = null;

    static
    {
        String driver = "org.h2.Driver";
        String url = "jdbc:h2:~/tp1";
        String user = "sa";
        String pass = "";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return connection;
    }
}