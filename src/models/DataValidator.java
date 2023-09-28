package models;

import models.exceptions.InvalidBirthdayException;
import models.exceptions.InvalidFIOException;
import models.exceptions.InvalidPhoneNumberException;
import models.exceptions.InvalidUserSexException;

public class DataValidator {

    public void checkInputData(String[] inputFromUser)
            throws InvalidFIOException, InvalidBirthdayException, InvalidPhoneNumberException, InvalidUserSexException {

        if (!checkFIO(new String[] { inputFromUser[0], inputFromUser[1], inputFromUser[2] })) {
            throw new InvalidFIOException();
        }

        if (!checkBirthDay(inputFromUser[3])) {
            throw new InvalidBirthdayException();
        }

        if (!checkPhoneNumber(inputFromUser[4])) {
            throw new InvalidPhoneNumberException();
        }

        if (!checkUserSex(inputFromUser[5])) {
            throw new InvalidUserSexException();
        }

    }

    private boolean checkFIO(String[] FIO) {

        for (String el : FIO) {

            if (!el.matches("[a-zA-Z]{2,}"))
                return false;
                
        }

        return true;
    }

    private boolean checkBirthDay(String birthDay) {

        return birthDay.matches("(?:3[0-1]|[0-2][0-9])[.](?:0[1-9]|1[0-2])[.]\\d{4}");

    }

    private boolean checkPhoneNumber(String number) {

        return number.matches("(?:8|7)\\d{10}");
    }

    private boolean checkUserSex(String sex) {

        return sex.toLowerCase().matches("(?:m|f)");
    }
}
