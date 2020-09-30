package be.abis.exa1.ut;

import be.abis.exa1.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void ageOfPersonFromBirthDateShouldBe42() {
        Person p1 = new Person(1, "Cecile", "Navez", LocalDate.of(1978, 5, 16));

        int personAge = p1.calculateAge();

        assertEquals(42, personAge);
        }
}
