package be.abis.exa1.ut;

import be.abis.exa1.exception.SalaryTooLowException;
import be.abis.exa1.model.Person;
import be.abis.exa1.service.AbisPaymentService;
import be.abis.exa1.service.PaymentService;
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
        PaymentService myPay = new AbisPaymentService();
        when(mockedPerson.calculateNetSalary()).thenThrow(new SalaryTooLowException());
        myPay.paySalary(mockedPerson);
        }
}
