package models.savers;

import java.io.IOException;

public interface Saver {

    public void save(String[] inputFromUser) throws IOException;

}
