package be.abis.exa1.ut;

import be.abis.exa1.exception.PersonShouldBeAdultException;
import be.abis.exa1.model.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestPerson {

    private Person person;
    private Person person2;

    @Before
    public void setUp() {
        person = new Person(1, "Cecile", "Navez", LocalDate.of(1978, 5, 16));
        person2 = new Person(1, "Nathan", "Dupont", LocalDate.of(2003, 5, 16));
    }
    

    @Test
    public void ageOfPersonFromBirthDateShouldBe42() throws PersonShouldBeAdultException{

        int personAge = person.calculateAge();
        assertThat(personAge, is(equalTo(42)));
        }

    @Test
    public void toStringSentenceStartsWithPerson() {

        String strPerson = person.toString();
        assertThat(strPerson, startsWith("Person"));
    }

    @Test(expected = PersonShouldBeAdultException.class)
    public void ageOfThePersonShouldBeOver18() throws PersonShouldBeAdultException {
        int personAge = person2.calculateAge();
    }
}
