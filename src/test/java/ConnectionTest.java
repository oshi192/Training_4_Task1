import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import static junit.framework.TestCase.assertTrue;

public class ConnectionTest {
    @Test
    public void tryConnection(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("dataBase_mySql");
        try {
            Class.forName(resourceBundle.getString("driver")).newInstance();
            Connection connection = DriverManager. getConnection(resourceBundle.getString("url"),
                    resourceBundle.getString("user"),
                    resourceBundle.getString("password"));
            connection.prepareStatement("select * from Credit");
            assertTrue(true);
            connection.prepareStatement("select * from Deposit");
            assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }
}
