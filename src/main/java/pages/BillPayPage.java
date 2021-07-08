package pages;

import methods.BillPayMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class BillPayPage extends BasePage {

    public BillPayPage(WebDriver driver) {
        super(driver);
    }

    public BillPayMethod method;

    public BillPayPage payBill(ArrayList<String> userData) {
        method = new BillPayMethod(driver);
        method.billPay(userData);
        return this;
    }

    public BillPayPage verifyPayBill() {
        method = new BillPayMethod(driver);
        method.verifyBillPay("Bill Payment Complete");
        return this;
    }
}
