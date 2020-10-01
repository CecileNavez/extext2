package be.abis.exa1.service;

import be.abis.exa1.exception.SalaryTooLowException;
import be.abis.exa1.model.Person;

public interface PaymentService {
    void paySalary(Person person) throws SalaryTooLowException;
}
