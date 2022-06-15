package contacts.command.concrete;

import contacts.command.Command;
import contacts.command.receiver.ContactsDatabase;

public class CountContactsCommand implements Command {
    private ContactsDatabase contactsDatabase;

    public CountContactsCommand(ContactsDatabase contactsDatabase) {
        this.contactsDatabase = contactsDatabase;
    }

    @Override
    public void execute() {
        contactsDatabase.countAllContacts();
    }
}
