package pages;

import methods.UpdateProfileMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class UpdateProfilePage extends BasePage {

    public UpdateProfilePage(WebDriver driver) {
        super(driver);
    }

    public UpdateProfileMethod method;

    public UpdateProfilePage updateProfile(ArrayList<String> userData) throws InterruptedException {
        method = new UpdateProfileMethod(driver);
        method.updateProfile(userData);
        return this;
    }

    public UpdateProfilePage verifyProfileUpdated() {
        method = new UpdateProfileMethod(driver);
        method.verifyUpdateProfile("Profile Updated");
        return this;
    }
}
