import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        MessageThread thread = new MessageThread();
        InputFromFile convoReader = new InputFromFile();
        String lineFromFile = convoReader.readFromFile();
        while (lineFromFile != null) {
            String[] lineElements = lineFromFile.split(":");
            String currentUser = lineElements[0];
            if (lineElements.length > 1){
                Message currentUserMessage = new Message(currentUser, lineElements[1]);
                thread.addMessage(currentUserMessage);
                thread.setSeenMessages(currentUser);
            }
            else {
                thread.setSeenMessages(currentUser);
                thread.print(currentUser);
            }
            lineFromFile = convoReader.readFromFile();
        }
    }
}