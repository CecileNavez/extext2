package be.abis.exa1.ut;

import be.abis.exa1.exception.SalaryTooLowException;
import be.abis.exa1.model.Person;
import be.abis.exa1.service.AbisPaymentService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestPaymentService {

    @Mock
    public Person mockedPerson;


    @Test(expected = SalaryTooLowException.class)
    public void netSalaryOfThePersonShouldBeOver1500() throws SalaryTooLowException {
        mockedPerson.setFirstName("Cecile");
        mockedPerson.setGrossSalary(2000.0);
        AbisPaymentService myPay = new AbisPaymentService();
        when(mockedPerson.calculateNetSalary()).thenThrow(new SalaryTooLowException());
        myPay.paySalary(mockedPerson);
        }
}
