package DI;

public class Application {
    private final MessageService messageService;
    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String sender) {
        messageService.sendMessage(message, sender);
    }
}
