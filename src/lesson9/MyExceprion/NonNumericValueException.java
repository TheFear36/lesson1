package lesson9.MyExceprion;

public class NonNumericValueException extends Exception {
    public NonNumericValueException(String message) {
        super(message);
    }

    public NonNumericValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
