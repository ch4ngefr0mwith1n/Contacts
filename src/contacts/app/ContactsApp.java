package contacts.app;

import contacts.command.Command;
import contacts.command.concrete.*;
import contacts.command.invoker.Controller;
import contacts.command.receiver.ContactsDatabase;

import java.util.*;

// ovo će da bude "Client" klasa:
public class ContactsApp {
    private Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();

    private ContactsDatabase database = new ContactsDatabase();

    private Map<String, Command> menuMap;
    private List<String> menuOptions = List.of("add", "list", "search", "count", "exit");

    // blok inicijalizacije za instancu, biće popunjen vrijednostima i komandama za mapu:
    {
        menuMap = new HashMap<>();
        menuMap.put("add", new AddContactCommand(database));
        menuMap.put("count", new CountContactsCommand(database));
        menuMap.put("list", new ListContactsCommand(database));
        menuMap.put("search", new SearchContactsCommand(database));
    }

    // metoda za startovanje aplikacije:
    public void start() {
        for (;;) {
            System.out.print("[menu] Enter action (add, list, search, count, exit): ");
            String action = scanner.next().trim().toLowerCase();

            if ("exit".equals(action)) {
                return;
            }

            if (!menuOptions.contains(action)) {
                System.out.println("Invalid option!");
            }

            Command command = menuMap.get(action);
            controller.setCommand(command);
            controller.executeCommand();
        }
    }

    
}
