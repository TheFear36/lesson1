package lesson9.MyExceprion;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
