package contacts.command.concrete;

import contacts.command.Command;
import contacts.command.receiver.ContactsDatabase;

public class SearchContactsCommand implements Command {

    private ContactsDatabase contactsDatabase;

    public SearchContactsCommand(ContactsDatabase contactsDatabase) {
        this.contactsDatabase = contactsDatabase;
    }

    @Override
    public void execute() {
        contactsDatabase.searchContacts();
    }
}
