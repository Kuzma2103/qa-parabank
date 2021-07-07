package pages;

import methods.ContactMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public ContactMethod method;

    public ContactPage contact(ArrayList<String> userData) {
        method = new ContactMethod(driver);
        method.contact(userData);
        return this;
    }

    public ContactPage verifyContact() {
        method = new ContactMethod(driver);
        method.verifyEmailSent("A Customer Care Representative will be contacting you.");
        return this;
    }
}
