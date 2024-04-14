package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertyFileUtility {

	
	private Properties properties;
	
	
	public PropertyFileUtility(String environment) {
		properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("./src/test/resources/"+environment+ ".properties");
			properties.load(fileInputStream);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String getDB_Url() {
		return properties.getProperty("db_url");
	}
	
	public String getDB_User() {
		return properties.getProperty("db_user");
	}
	
	public String getDB_Password() {
		return properties.getProperty("db_password");
	}
	
	public String getfreereg_url() {	
		return properties.getProperty("freereg_url");	
	}
	
	public String getpaidreg_url() {	
		return properties.getProperty("paidreg_url");	
	}
	
	public String getadminlogin_url() {	
		return properties.getProperty("adminlogin_url");	
	}
	
	public String gettenantlogin_url() {	
		return properties.getProperty("tenantlogin_url");	
	}
	
	
}
