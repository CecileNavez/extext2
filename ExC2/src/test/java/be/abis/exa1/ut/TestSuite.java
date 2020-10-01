package be.abis.exa1.ut;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        TestAddress.class, TestPerson.class, TestCompany.class, TestPaymentService.class
})

public class TestSuite {
}
