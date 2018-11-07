package jdbc;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class ConnectionPool {

    private static DataSource dataSource;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("dataBase_mySql");
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(resourceBundle.getString("url"));
        ds.setPassword(resourceBundle.getString("password"));
        ds.setUsername(resourceBundle.getString("user"));
        ds.setDriverClassName(resourceBundle.getString("driver"));
        dataSource = ds;
    }

    private ConnectionPool() {
    }
    public static Connection getConnection() throws SQLException {
        return  dataSource.getConnection();
    }


}
