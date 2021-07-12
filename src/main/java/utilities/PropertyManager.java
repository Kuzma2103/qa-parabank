package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;
    private static String bad_password;

    // User data
    private static String firstName;
    private static String lastName;
    private static String address;
    private static String city;
    private static String state;
    private static String zipCode;
    private static String ssn;
    private static String userName;
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
        bad_password = properties.getProperty("bad_password");

        // User registration properties
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        address = properties.getProperty("address");
        city = properties.getProperty("city");
        state = properties.getProperty("state");
        zipCode = properties.getProperty("zipCode");
        ssn = properties.getProperty("ssn");
        userName = properties.getProperty("userName");
        password = properties.getProperty("password");

        return instance;
    }

    public static void setProperty(String key, String value) {
        Properties editProperties = new Properties();

        try {
            FileInputStream fileEdit = new FileInputStream("src/main/resources/configuration.properties");
            editProperties.load(fileEdit);
            editProperties.setProperty(key, value);
            editProperties.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Getters
    public String getDriverPath() {
        return driverPath;
    }

    public String getUrl() {
        return url;
    }

    public String getBadPassword() {
        return bad_password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getSSN() {
        return ssn;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
