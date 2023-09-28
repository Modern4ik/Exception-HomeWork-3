package models.exceptions;

public class InvalidUserSexException extends RuntimeException {
    public InvalidUserSexException() {
        super("RuntimeException: InvalidUserSexException");
    }

    public InvalidUserSexException(String errorMessage) {
        super(errorMessage);
    }
}
