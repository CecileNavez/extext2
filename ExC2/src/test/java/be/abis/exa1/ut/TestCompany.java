package be.abis.exa1.ut;

import be.abis.exa1.model.Address;
import be.abis.exa1.model.Company;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestCompany {

    @Test
    public void taxForBelgianCompanyShouldBe51() {
        Address a1 = new Address("rue du marais", "10", "1000", "Brussels", "Belgium","BE");
        Company c1 = new Company("BNPPF", a1);

        assertThat(c1.calculateTaxToPay(), is(equalTo(51.0)));
    }
}
