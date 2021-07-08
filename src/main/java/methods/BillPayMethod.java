package methods;

import data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class BillPayMethod extends BasePage {

    public BillPayMethod(WebDriver driver) {
        super(driver);
    }

    By billPayBy = By.xpath("//a[text()='Bill Pay']");
    By payeeNameBy = By.name("payee.name");
    By addressBy = By.name("payee.address.street");
    By cityBy = By.name("payee.address.city");
    By stateBy = By.name("payee.address.state");
    By zipCodeBy = By.name("payee.address.zipCode");
    By phoneBy = By.name("payee.phoneNumber");
    By accountBy = By.name("payee.accountNumber");
    By verifyAccountBy = By.name("verifyAccount");
    By amountBy = By.name("amount");
    By sendPaymentButtonBy = By.xpath("//input[@type='submit'][@value='Send Payment']");

    By messageBy = By.xpath("//h1[@class='title'][text()='Bill Payment Complete']");

    public BillPayMethod billPay(ArrayList<String> userData) {
        RegistrationData.registrationData(userData);
        click(billPayBy);
        writeText(payeeNameBy, userData.get(0));
        writeText(addressBy, userData.get(2));
        writeText(cityBy, userData.get(3));
        writeText(stateBy, userData.get(4));
        writeText(zipCodeBy, userData.get(5));
        writeText(phoneBy, userData.get(6));
        writeText(accountBy, userData.get(5));
        writeText(verifyAccountBy, userData.get(5));
        writeText(amountBy, "1000");
        click(sendPaymentButtonBy);
        return this;
    }

    public BillPayMethod verifyBillPay(String expectedText) {
        String message = readText(messageBy);
        assertStringEquals(message, expectedText);
        return this;
    }
}
