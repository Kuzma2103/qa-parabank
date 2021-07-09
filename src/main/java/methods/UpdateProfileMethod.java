package methods;

import data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class UpdateProfileMethod extends BasePage {

    public UpdateProfileMethod(WebDriver driver) {
        super(driver);
    }

    By updateContactBy = By.xpath("//a[text()='Update Contact Info']");
    By addressBy = By.id("customer.address.street");
    By cityBy = By.id("customer.address.city");
    By stateBy = By.id("customer.address.state");
    By phoneBy = By.id("customer.phoneNumber");
    By updateProfileButtonBy = By.xpath("//input[@type='submit'][@value='Update Profile']");
    By messageBy = By.xpath("//h1[@class='title'][text()='Profile Updated']");

    // Update the user profile - Change address, city, state and phone
    public UpdateProfileMethod updateProfile(ArrayList<String> userData) throws InterruptedException {
        RegistrationData.registrationData(userData);
        click(updateContactBy);
        Thread.sleep(2000);
        writeText(addressBy, userData.get(2));
        writeText(cityBy, userData.get(3));
        writeText(stateBy, userData.get(4));
        writeText(phoneBy, userData.get(6));
        click(updateProfileButtonBy);
        return this;
    }

    public UpdateProfileMethod verifyUpdateProfile(String expectedText) {
        String message = readText(messageBy);
        assertStringEquals(message, expectedText);
        return this;
    }

}
