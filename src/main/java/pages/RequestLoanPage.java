package pages;

import methods.RequestLoanMethod;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage extends BasePage {

    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }

    public RequestLoanMethod method;

    public RequestLoanPage requestLoan() throws InterruptedException {
        method = new RequestLoanMethod(driver);
        method.requestLoan();
        return this;
    }

    public RequestLoanPage verifyRequestLoan() throws InterruptedException {
        method = new RequestLoanMethod(driver);
        method.verifyRequestLoan("Loan Request Processed");
        return this;
    }
}
