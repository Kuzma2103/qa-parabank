package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;

    // User data
    private static String username;
    private static String password;

    // Get the properties instance from the file configuration.properties
    public static PropertyManager getInstance() {

        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream file = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driverPath = properties.getProperty("driverPath");
        url = properties.getProperty("url");

        return instance;
    }

    public static void setUserData(String username, String password) {
        Properties properties = new Properties();
        File file = new File("src/main/resources/registration.properties");

        try {
            FileOutputStream output = new FileOutputStream(file);
            properties.setProperty("username", username);
            properties.setProperty("password", password);
            properties.store(output, "Faker registration data");
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PropertyManager getUserData() {

        Properties properties = new Properties();
        PropertyManager data = new PropertyManager();

        try {
            FileInputStream file = new FileInputStream("src/main/resources/registration.properties");
            properties.load(file);
        } catch (Exception e)  {
            e.printStackTrace();
        }

        username = properties.getProperty("username");
        password = properties.getProperty("password");

        return data;
    }

    // Geters
    public String getDriverPath() {
        return driverPath;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
