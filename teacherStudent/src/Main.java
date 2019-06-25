import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
public class Main {

    public static void main(String[] args) throws Exception {

        InputFromFile fileReader = new InputFromFile();
        String lineFromFile = fileReader.readFromFile();

        while (lineFromFile != null) {
            String[] lineElements = lineFromFile.split(" ");
            fileReader.manageLineInstructions(lineElements);

            lineFromFile = fileReader.readFromFile();
        }
    }

}
