package GenericUtility;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseClass {

	public DataBaseUtility dUtil = new DataBaseUtility();
	public PropertyFileUtility pUtil;
	
	@BeforeSuite()
	public void BS_Config() throws SQLException {
		dUtil.getConnection();
		System.out.println("--------DataBase Connected---------");
	}
	@BeforeTest()
	@BeforeClass()
	public void BC_Config() throws IOException, SQLException {
		
		String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
		pUtil = new PropertyFileUtility(environment);
        String sqlQuery = "select environment_name from env;";
		ResultSet result = dUtil.executeQuery(sqlQuery);
        while (result.next()) {
		String	env_name = result.getString("environment_name");
		System.out.println(env_name);

		}
		
	
	}
	
	@BeforeMethod()
	
	@AfterMethod()
	
	@AfterClass()
	
	@AfterTest()
	@AfterSuite()
	public void AF_Config() throws SQLException {
		
		        String sqlQuery = "select environment_name from env;";
		        ResultSet result = dUtil.executeQuery(sqlQuery);
				result.close();
				dUtil.closeConnection(dUtil.getConnection());
                
	}
}
