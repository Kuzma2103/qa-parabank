package utilities;

import java.io.File;
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
        bad_password = properties.getProperty("bad_password");

        return instance;
    }


    public static void setUserData(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zipCode,
            String ssn,
            String username,
            String password
    ) {
        Properties properties = new Properties();
        File file = new File("src/main/resources/registration.properties");

        try {
            FileOutputStream output = new FileOutputStream(file);
            properties.setProperty("firstName", firstName);
            properties.setProperty("lastName", lastName);
            properties.setProperty("address", address);
            properties.setProperty("city", city);
            properties.setProperty("state", state);
            properties.setProperty("zipCode", zipCode);
            properties.setProperty("ssn", ssn);
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

        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        address = properties.getProperty("address");
        city = properties.getProperty("city");
        state = properties.getProperty("state");
        zipCode = properties.getProperty("zipCode");
        ssn = properties.getProperty("ssn");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

        return data;
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

    public String getSsn() {
        return ssn;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
