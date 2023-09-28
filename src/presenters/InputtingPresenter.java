package presenters;

import java.io.IOException;

import models.exceptions.InvalidBirthdayException;
import models.exceptions.InvalidFIOException;
import models.exceptions.InvalidPhoneNumberException;
import models.exceptions.InvalidUserSexException;

public class InputtingPresenter implements ViewObserver {

    private View view;
    private Model model;

    public InputtingPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setObserver(this);
    }

    public void onInputUser(String[] inputFromUser) {

        try {
            this.model.saveData(inputFromUser);

        } catch (InvalidFIOException exc) {

            view.printException(-1, exc.getStackTrace());

        } catch (InvalidBirthdayException exc) {

            view.printException(-2, exc.getStackTrace());

        } catch (InvalidPhoneNumberException exc) {

            view.printException(-3, exc.getStackTrace());

        } catch (InvalidUserSexException exc) {

            view.printException(-4, exc.getStackTrace());

        } catch (IOException exc) {

            view.printException(-5, exc.getStackTrace());

        } catch (Exception exc) {

            view.printException(-500, exc.getStackTrace());

        }
    }
}