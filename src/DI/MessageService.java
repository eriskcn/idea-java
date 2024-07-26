package DI;

public class MessageService implements IMessageService {
    public void sendMessage(String message, String sender) {
        System.out.println("Message sent from " + sender + " with message: " + message);
    }
}
