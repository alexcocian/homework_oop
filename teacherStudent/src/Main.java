/**
 * @author Catalin Moldovan
 */
public class Main {

    public static void main(String[] args) throws Exception {
        InputFromFile fileReader = new InputFromFile();
        InstructionExecutor executor = new InstructionExecutor();

        String lineFromFile = fileReader.readFromFile();
        while (lineFromFile != null) {
            String[] lineElements = lineFromFile.split(" ");
            executor.executeLine(lineElements);
            lineFromFile = fileReader.readFromFile();
        }
    }
}
