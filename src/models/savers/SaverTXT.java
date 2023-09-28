package models.savers;

import java.io.FileWriter;
import java.io.IOException;

public class SaverTXT implements Saver {
    public void save(String[] inputFromUser) throws IOException {

        try (FileWriter fileWriter = new FileWriter("src/models/database/" + inputFromUser[0].toLowerCase() + ".txt", true)) {

            StringBuilder data = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                data.append(inputFromUser[i].substring(0, 1).toUpperCase()
                        + inputFromUser[i].substring(1).toLowerCase());
            }

            data.append(";" + inputFromUser[3] + ";");
            data.append(inputFromUser[4] + ";");
            data.append(inputFromUser[5] + "\n");

            fileWriter.write(data.toString());
        }
    }
}