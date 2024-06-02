package SampleRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateTenanat1 {

    public static void main(String[] args) {
        // Set up the WebDriver (assuming ChromeDriver is in your PATH)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Run your registration script
            driver.get("your_registration_url");
            // Your registration automation code here...
            
            // Fetch tenant ID and FK ID from the database
            String tenantId = fetchFromDatabase("SELECT tenant_id FROM your_table WHERE condition");
            String fkId = fetchFromDatabase("SELECT fk_id FROM your_table WHERE condition");

            // Update the properties file
            updatePropertiesFile(tenantId, fkId);

        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }

    public static String fetchFromDatabase(String query) {
        String result = "";
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            if (resultSet.next()) {
                result = resultSet.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void updatePropertiesFile(String tenantId, String fkId) {
        Properties properties = new Properties();
        String propertiesFilePath = "path/to/your.properties";

        try (FileOutputStream output = new FileOutputStream(propertiesFilePath)) {
            // Load existing properties file
            properties.load(UpdateTenanat1.class.getResourceAsStream("/path/to/your.properties"));

            // Set new values
            properties.setProperty("tenantId", tenantId);
            properties.setProperty("fkId", fkId);

            // Save the properties file
            properties.store(output, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
