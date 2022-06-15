package contacts.command.concrete;

import contacts.command.Command;
import contacts.command.receiver.ContactsDatabase;

public class ListContactsCommand implements Command {
    private ContactsDatabase contactsDatabase;

    public ListContactsCommand(ContactsDatabase contactsDatabase) {
        this.contactsDatabase = contactsDatabase;
    }

    @Override
    public void execute() {
        contactsDatabase.listAllContacts();
    }
}
