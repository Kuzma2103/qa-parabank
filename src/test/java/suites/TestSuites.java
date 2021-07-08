package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.LogoutTest;
import tests_with_login.OpenNewAccountTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        FailLoginTest.class,
        LogoutTest.class,
        ForgotLoginTest.class,
        OpenNewAccountTest.class,
        ContactTest.class,
})

public class TestSuites {
}
