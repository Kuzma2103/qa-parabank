package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ForgotLoginTest;
import tests.LoginTest;
import tests.RegistrationTest;
import tests_with_login.LogoutTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        LogoutTest.class,
        ForgotLoginTest.class
})

public class TestSuites {
}
