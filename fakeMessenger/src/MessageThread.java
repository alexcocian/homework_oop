import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class MessageThread {
    private List<Message> allMessages;

    MessageThread() {
        this.allMessages = new ArrayList<>();
    }

    void addMessage(Message message) {
        allMessages.add(message);
    }

    void print(String user) {
        System.out.println(user + " checks messages");
        for (Message message : allMessages) {
            if ((message.getSeenBy().size() == 1) && message.wasSeenBy(user)) {
                System.out.println(message.toString() + "*");
            }
            else
                System.out.println(message.toString());
        }
    }

    void setSeenMessages(String user) {
        for (Message message: allMessages) {
            message.markAsSeen(user);
        }
    }
}

