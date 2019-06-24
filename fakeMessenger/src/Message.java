import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class Message {
    private String writtenByUser;
    private List<String> seenBy;
    private String message;

    Message(String user, String newMessage) {
        seenBy = new ArrayList<>();
        this.writtenByUser = user;
        this.message = newMessage;
    }

    @Override
    public String toString() {
        return this.writtenByUser + ":" + this.message;
    }

    void markAsSeen(String user) {
        if(!seenBy.contains(user))
            seenBy.add(user);
    }

    boolean wasSeenBy(String user) {
        return seenBy.contains(user);
    }

    List<String> getSeenBy() {
        return seenBy;
    }
}
