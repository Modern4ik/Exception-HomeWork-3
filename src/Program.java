import models.SaveModel;
import presenters.InputtingPresenter;
import presenters.Model;
import presenters.View;
import views.InputtingView;

public class Program {
    public static void main(String[] args) throws Exception {
        View view = new InputtingView();
        Model model = new SaveModel();

        InputtingPresenter presenter = new InputtingPresenter(view, model);

        view.getUserInput();
    }
}
