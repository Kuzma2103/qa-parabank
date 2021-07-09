package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;


public class RequestLoanMethod extends BasePage {

    public RequestLoanMethod(WebDriver driver) {
        super(driver);
    }

    By requestLoanBy = By.xpath("//a[text()='Request Loan']");
    By loanAmountBy = By.id("amount");
    By downPaymentBy = By.id("downPayment");
    By applyNowButtonBy = By.xpath("//input[@value='Apply Now']");
    By messageBy = By.xpath("//h1[@class='title'][text()='Loan Request Processed']");

    public RequestLoanMethod requestLoan() throws InterruptedException {
        click(requestLoanBy);
        Thread.sleep(2000);
        writeText(loanAmountBy, "500");
        writeText(downPaymentBy, "400");
        click(applyNowButtonBy);
        return this;
    }

    public RequestLoanMethod verifyRequestLoan(String expectedText) {
        String message = readText(messageBy);
        assertStringEquals(message, expectedText);
        return this;
    }
}
