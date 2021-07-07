package methods;

import data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.RegistrationPage;

import java.util.ArrayList;

public class ForgotLoginMethod extends BasePage {

    public ForgotLoginMethod(WebDriver driver) {
        super(driver);
    }

    By forgotLoginInfoBy = By.xpath("//a[text()='Forgot login info?']");
    By firstNameBy = By.id("firstName");
    By lastNameBy = By.id("lastName");
    By addressBy = By.id("address.street");
    By cityBy = By.id("address.city");
    By stateBy = By.id("address.state");
    By zipCodeBy = By.id("address.zipCode");
    By ssnBy = By.id("ssn");
    By findLoginInfoBy = By.xpath("//input[@type='submit'][@value='Find My Login Info']");
    By messageBy = By.xpath("//*[@id='rightPanel']/p[1]");
    By errorMessageBy = By.className("error");

    public ForgotLoginMethod forgotLoginForExistUser(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zipCode,
            String ssn
    ) {
        click(forgotLoginInfoBy);
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(addressBy, address);
        writeText(cityBy, city);
        writeText(stateBy, state);
        writeText(zipCodeBy, zipCode);
        writeText(ssnBy, ssn);
        click(findLoginInfoBy);
        return this;
    }

    public ForgotLoginMethod forgotLoginForNonExistUser(
            ArrayList<String> userData
    ) {
        RegistrationData.registrationData(userData);
        click(forgotLoginInfoBy);
        writeText(firstNameBy, userData.get(0));
        writeText(lastNameBy, userData.get(1));
        writeText(addressBy, userData.get(2));
        writeText(cityBy, userData.get(3));
        writeText(stateBy, userData.get(4));
        writeText(zipCodeBy, userData.get(5));
        writeText(ssnBy, userData.get(7));
        click(findLoginInfoBy);
        return this;
    }

    public ForgotLoginMethod verifyCorrectUserInfo(String expectedText) {
        String message = readText(messageBy);
        assertStringEquals(message, expectedText);
        return this;
    }

    public ForgotLoginMethod verifyNonExistUserInfo(String expectedText) {
        String errorMessage = readText(errorMessageBy);
        assertStringEquals(errorMessage, expectedText);
        return this;
    }
}
