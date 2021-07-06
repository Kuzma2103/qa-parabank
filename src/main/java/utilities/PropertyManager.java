package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;

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

    // Geters
    public String getDriverPath() {
        return driverPath;
    }

    public String getUrl() {
        return url;
    }
}
