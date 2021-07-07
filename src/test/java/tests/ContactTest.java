package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.ContactPage;

import java.util.ArrayList;

public class ContactTest extends BaseTest {
    public ContactPage contactPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void contactTest() {
        contactPage = new ContactPage(driver);
        contactPage.contact(userData);

        try {
            contactPage.verifyContact();
            System.out.print("The message has been sent.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
