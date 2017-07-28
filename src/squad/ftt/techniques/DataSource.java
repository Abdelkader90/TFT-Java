package squad.ftt.techniques;

/**
 *
 * @author hppro
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Mehdi
 */
public class DataSource {

    private String url;
    private String login;
    private String password;
    private Connection connection;
    private static DataSource instance;

    private DataSource() {
        try {
            url = ("jdbc:mysql://localhost:3306/fttfinal");
            login = "root";
            password = "";
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }
}

    

