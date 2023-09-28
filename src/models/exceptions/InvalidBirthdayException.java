package models.exceptions;

public class InvalidBirthdayException extends RuntimeException{
    public InvalidBirthdayException(){
        super("RuntimeException: InvalidBirthdayException");
    }

    public InvalidBirthdayException(String errorMessage){
        super(errorMessage);
    }
}
