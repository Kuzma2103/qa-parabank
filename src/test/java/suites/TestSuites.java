package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        FailLoginTest.class,
        LogoutTest.class,
        ForgotLoginTest.class,
        OpenNewAccountTest.class,
        TransferFundsTest.class,
        BillPayTest.class,
        UpdateProfileTest.class,
        RequestLoanTest.class,
        ContactTest.class,
})

public class TestSuites {
}
