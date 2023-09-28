package models.exceptions;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException(){
        super("RuntimeException: InvalidPhoneNumberException");
    }

    public InvalidPhoneNumberException(String errorMessage){
        super(errorMessage);
    }
}
