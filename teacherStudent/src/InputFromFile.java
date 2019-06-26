import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Catalin Moldovan
 */
class InputFromFile {

    private BufferedReader fileInstructions;

    InputFromFile() throws FileNotFoundException {
        String inputFilePath = "E:\\_Work_Catalin\\Project_J\\TeacherStudentInput.txt";
        fileInstructions = new BufferedReader(new java.io.FileReader(inputFilePath));
    }

    String readFromFile() throws IOException {
        return fileInstructions.readLine();
    }
}
