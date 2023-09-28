package models.exceptions;

public class InvalidFIOException extends RuntimeException {
    public InvalidFIOException() {
        super("RuntimeException: InvalidFIOException");
    }

    public InvalidFIOException(String errorMessage) {
        super(errorMessage);
    }
}
