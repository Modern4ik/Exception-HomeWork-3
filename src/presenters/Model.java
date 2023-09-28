package presenters;

import java.io.IOException;

public interface Model {
    void saveData(String[] inputFromUser) throws IOException;
}
