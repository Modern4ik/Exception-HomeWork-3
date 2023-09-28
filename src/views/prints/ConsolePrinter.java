package views.prints;

import views.Text;

public class ConsolePrinter implements Printer {
    public void printMessage(String message) {
        System.out.println("-----------------");
        System.out.println(message);
        System.out.println("-----------------");
    }

    public void printExceptionMessage(int exceptionCode, StackTraceElement[] stackTrace) {
        switch (exceptionCode) {
            case -1:
                printMessage(Text.excMessageFIO);
                break;
            case -2:
                printMessage(Text.excMessageBirthday);
                break;
            case -3:
                printMessage(Text.excMessagePhoneNumb);
                break;
            case -4:
                printMessage(Text.excMessageSex);
                break;
            case -5:
                printMessage(Text.excMessageIO);

                for (StackTraceElement el : stackTrace) {
                    System.out.println(el);
                }

                break;
            case -500:
                printMessage(Text.excMessageUnknow);

                for (StackTraceElement el : stackTrace) {
                    System.out.println(el);
                }
                
                break;
        }
    }
}
