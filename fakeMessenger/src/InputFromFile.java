import java.io.*;

/**
 * @author Catalin Moldovan
 */
class InputFromFile {
    private BufferedReader convoReader;

    InputFromFile() throws FileNotFoundException {
        String convoInputPath = "E:\\_Work_Catalin\\Project_J\\ConversationInput.txt";
        convoReader = new BufferedReader(new java.io.FileReader(convoInputPath));
    }

    String readFromFile() throws IOException {
        return convoReader.readLine();
    }
}
