package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.UpdateProfilePage;

import java.util.ArrayList;

public class UpdateProfileTest extends BaseTestWithLogin {

    public UpdateProfilePage updateProfilePage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void updateProfile() throws InterruptedException {
        updateProfilePage = new UpdateProfilePage(driver);
        updateProfilePage.updateProfile(userData);

        try {
            updateProfilePage.verifyProfileUpdated();
            System.out.print("The user profile is updated.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
