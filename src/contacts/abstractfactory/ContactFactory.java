package contacts.abstractfactory;

/*
    - "Concrete Creator" klasa unutar "Factory" pattern-a:
 */
public class ContactFactory extends AbstractContactFactory {

    @Override
    public Contact createContact(ContactType contactType) {
        Contact contact = null;

        switch (contactType) {
            case PERSON:
                contact = new Person();
                break;
            case ORGANIZATION:
                contact = new Organization();
                break;
        }

        return contact;
    }
}
