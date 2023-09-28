package views.prints;

public interface Printer {
    public void printMessage(String message);

    public void printExceptionMessage(int exceptionCode, StackTraceElement[] stackTrace);
}
