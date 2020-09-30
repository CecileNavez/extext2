package be.abis.exa1.ut;

import be.abis.exa1.model.Address;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestAddress {

    @Test
    public void belgianZipCodeShouldBeNumeric() {
        Address a1 = new Address("rue du Marais", "10", "1000", "Brussels", "Belgium", "BE" );
        assertTrue(a1.checkBelgianZipCode());
    }


}
