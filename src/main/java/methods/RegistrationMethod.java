package methods;

import data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class RegistrationMethod extends BasePage {

    public RegistrationMethod(WebDriver driver) {
        super(driver);
    }

    By registerBy = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By firstNameBy = By.id("customer.firstName");
    By lastNameBy = By.id("customer.lastName");
    By addressBy = By.id("customer.address.street");
    By cityBy = By.id("customer.address.city");
    By stateBy = By.id("customer.address.state");
    By zipCodeBy = By.id("customer.address.zipCode");
    By phoneBy = By.id("customer.phoneNumber");
    By ssnBy = By.id("customer.ssn");
    By usernameBy = By.id("customer.username");
    By passwordBy = By.id("customer.password");
    By confirmPasswordBy = By.id("repeatedPassword");
    By registerButtonBy = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    By titleBy = By.className("title");


    public RegistrationMethod registerUser(ArrayList<String> registerData) {
        RegistrationData.registrationData(registerData);
        click(registerBy);
        writeText(firstNameBy, registerData.get(0));
        writeText(lastNameBy, registerData.get(1));
        writeText(addressBy, registerData.get(2));
        writeText(cityBy, registerData.get(3));
        writeText(stateBy, registerData.get(4));
        writeText(zipCodeBy, registerData.get(5));
        writeText(phoneBy, registerData.get(6));
        writeText(ssnBy, registerData.get(7));
        writeText(usernameBy, registerData.get(8));
        writeText(passwordBy, registerData.get(9));
        writeText(confirmPasswordBy, registerData.get(9));
        click(registerButtonBy);
        return this;
    }

    public RegistrationMethod validateRegister(String expectedText) {
        String title = readText(titleBy);
        assertStringEquals(title, expectedText);
        return this;
    }
}
