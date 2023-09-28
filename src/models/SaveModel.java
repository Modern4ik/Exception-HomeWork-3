package models;

import java.io.IOException;

import models.exceptions.InvalidBirthdayException;
import models.exceptions.InvalidFIOException;
import models.exceptions.InvalidPhoneNumberException;
import models.exceptions.InvalidUserSexException;
import models.savers.Saver;
import models.savers.SaverTXT;
import presenters.Model;

public class SaveModel implements Model {

    public void saveData(String[] inputFromUser)
            throws InvalidFIOException, InvalidBirthdayException, InvalidPhoneNumberException, InvalidUserSexException, IOException{

        DataValidator validator = new DataValidator();
        Saver saver = new SaverTXT();

        validator.checkInputData(inputFromUser);

        saver.save(inputFromUser);
    }
}
