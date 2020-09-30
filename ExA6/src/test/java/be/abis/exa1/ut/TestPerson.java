package be.abis.exa1.ut;

import be.abis.exa1.model.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPerson {

    private Person person;

    @Before
    public void setUp() {
        Person person = new Person(1, "Cecile", "Navez", LocalDate.of(1978, 5, 16));
    }
    
    @Test
    public void ageOfPersonFromBirthDateShouldBe42() {

        int personAge = person.calculateAge();
        assertThat(personAge, is(equalTo(42)));
        }

    @Test
    public void toStringSentenceStartsWithPerson() {

        String strPerson = person.toString();
        assertThat(strPerson, startsWith("Person"));
    }
}
