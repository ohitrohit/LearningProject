package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

    public Connection getConnection() throws SQLException {
    	String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
        PropertyFileUtility pUtil = new PropertyFileUtility(environment);
        String DB_URL = pUtil.getDB_Url();
        String DB_USER = pUtil.getDB_User();
        String DB_PASSWORD = pUtil.getDB_Password();

//        Driver driverRef = new Driver();
//        DriverManager.registerDriver(driverRef);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
    public ResultSet executeQuery(String query) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        
        connection = getConnection();
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    
    public void closeConnection(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("--------Database connection closed-----------");
        }
    }

   
}
