package lesson9.MyExceprion;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
