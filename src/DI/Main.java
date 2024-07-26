package DI;

public class Main {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        Application app = new Application(messageService);
        app.processMessage("Hello, World!", "IntelliJ");
    }
}
