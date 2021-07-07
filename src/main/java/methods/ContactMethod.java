package methods;

import data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class ContactMethod extends BasePage {

    public ContactMethod(WebDriver driver) {
        super(driver);
    }

    By contactBy = By.xpath("//a[text()='contact']");
    By nameBy = By.id("name");
    By emailBy = By.id("email");
    By phoneBy = By.id("phone");
    By messageBy = By.id("message");
    By sendMessageBy = By.xpath("//input[@type='submit'][@value='Send to Customer Care']");
    By successMessageBy = By.xpath("//*[@id='rightPanel']/p[2]");



    public ContactMethod contact(ArrayList<String> userData) {
        RegistrationData.registrationData(userData);
        click(contactBy);
        writeText(nameBy, userData.get(0));
        writeText(emailBy, userData.get(10));
        writeText(phoneBy, userData.get(6));
        writeText(messageBy, userData.get(11));
        click(sendMessageBy);
        return this;
    }

    public ContactMethod verifyEmailSent(String expectedText) {
        String message = readText(successMessageBy);
        assertStringEquals(message, expectedText);
        return this;
    }
}
