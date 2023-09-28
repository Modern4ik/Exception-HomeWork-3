package views;

import presenters.ViewObserver;
import views.inputs.ConsoleInputter;
import views.inputs.Inputter;
import views.prints.ConsolePrinter;
import views.prints.Printer;
import presenters.View;

public class InputtingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void getUserInput() {
        Inputter inputter = new ConsoleInputter();

        observer.onInputUser(inputter.getInputFromUser());
    }

    public void printException(int excCode, StackTraceElement[] excTrace){
        Printer printer = new ConsolePrinter();

        printer.printExceptionMessage(excCode, excTrace);
    }
}
