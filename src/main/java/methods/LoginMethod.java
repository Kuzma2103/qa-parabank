package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginMethod extends BasePage {

    public LoginMethod(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.name("username");
    By passwordBy = By.name("password");
    By loginBy = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By userBy = By.className("title");

    public LoginMethod login(String username, String password) {
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginBy);
        return this;
    }

    public LoginMethod validateLogin(String expectedText) {
        String user = readText(userBy);
        assertStringEquals(user, expectedText);
        return this;
    }
}
