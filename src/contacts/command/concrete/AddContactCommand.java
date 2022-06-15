package contacts.command.concrete;

import contacts.command.Command;
import contacts.command.receiver.ContactsDatabase;

public class AddContactCommand implements Command {
    private ContactsDatabase contactsDatabase;

    public AddContactCommand(ContactsDatabase contactsDatabase) {
        this.contactsDatabase = contactsDatabase;
    }

    @Override
    public void execute() {
        contactsDatabase.addContact();
    }
}
