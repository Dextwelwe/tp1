import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCclass {


    private static final String JdbcDriver = "org.h2.Driver";
    private static final String JdbcURL = "jdbc:h2:~/tp1" ;
    private static final String user = "sa";
    private static final String password = "";


    static {
        try {
            Class.forName(JdbcDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
