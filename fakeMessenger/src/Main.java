import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        MessageThread thread = new MessageThread();
        InputFromFile convoReader = new InputFromFile();
        String lineOfText = convoReader.readFromFile();
        while (lineOfText != null) {
            String[] line = lineOfText.split(":");
            String user = line[0];
            if (line.length > 1){
                Message newMessage = new Message(user, line[1]);
                thread.addMessage(newMessage);
                thread.setSeenMessages(user);
            }
            else {
                thread.setSeenMessages(user);
                thread.print(user);
            }
            lineOfText = convoReader.readFromFile();
        }
    }
}