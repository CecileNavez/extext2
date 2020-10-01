package be.abis.exa1.service;

import be.abis.exa1.exception.SalaryTooLowException;
import be.abis.exa1.model.Person;

public class AbisPaymentService implements PaymentService {

    @Override
    public void paySalary(Person person) throws SalaryTooLowException {
        System.out.println("Paying " + person.calculateNetSalary() + " euro to " + person.getFirstName() + ".");
    }
}


