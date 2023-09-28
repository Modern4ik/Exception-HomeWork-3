package presenters;

public interface View {
    void getUserInput();

    void printException(int excCode, StackTraceElement[] excTrace);

    void setObserver(ViewObserver observer);
}
