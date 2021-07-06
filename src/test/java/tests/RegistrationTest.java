package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.RegistrationPage;
import utilities.PropertyManager;

import java.util.ArrayList;

public class RegistrationTest extends BaseTest {
    public RegistrationPage registrationPage;
    public ArrayList<String> registerData = new ArrayList<>();

    @Test
    public void registrationTest() {
        registrationPage = new RegistrationPage(driver);

        registrationPage.registration(registerData);

        try {
            PropertyManager.setUserData(registerData.get(8), registerData.get(9));
            registrationPage.validation();
            System.out.print("Everything is ok.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
