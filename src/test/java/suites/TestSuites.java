package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ContactTest;
import tests.ForgotLoginTest;
import tests.LoginTest;
import tests.RegistrationTest;
import tests_with_login.LogoutTest;
import tests_with_login.OpenNewAccountTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        LogoutTest.class,
        ForgotLoginTest.class,
        OpenNewAccountTest.class,
        ContactTest.class,
})

public class TestSuites {
}
