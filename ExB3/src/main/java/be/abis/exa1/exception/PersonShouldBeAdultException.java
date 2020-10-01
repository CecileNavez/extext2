package be.abis.exa1.exception;

public class PersonShouldBeAdultException extends Exception {
    public PersonShouldBeAdultException() {
    }

    public PersonShouldBeAdultException(String message) {
        super(message);
    }
}
