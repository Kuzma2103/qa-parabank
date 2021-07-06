package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LogoutMethod extends BasePage {

    public LogoutMethod(WebDriver driver) {
        super(driver);
    }

    By logoutBy = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");
    By linkBy = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");

    public LogoutMethod logout() {
        click(logoutBy);
        return this;
    }

    public LogoutMethod verifyLogout(String expectedText) {
        String link = readText(linkBy);
        assertStringEquals(link, expectedText);
        return this;
    }
}
