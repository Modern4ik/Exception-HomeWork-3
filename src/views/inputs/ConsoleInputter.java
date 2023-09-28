package views.inputs;

import java.util.Scanner;

import views.Text;
import views.prints.ConsolePrinter;
import views.prints.Printer;

public class ConsoleInputter implements Inputter {

    public String[] getInputFromUser() {
        Scanner input = new Scanner(System.in);
        Printer printer = new ConsolePrinter();

        boolean isNotCorrect = true;
        String[] userInput = new String[6];

        while (isNotCorrect) {
            System.out.print("\033[H\033[J");
            printer.printMessage(Text.inputMessage);

            userInput = input.nextLine().split(" ");

            if (userInput.length != 6) {
                printer.printMessage(Text.inputError);

                viewSleep();
                continue;
            }

            isNotCorrect = false;
        }

        input.close();
        return userInput;
    }

    private void viewSleep() {
        try {
            Thread.sleep(3500);
        } catch (Exception exc) {
            System.out.println("Ошибка сна потока: " + exc);
        }
    }
}
