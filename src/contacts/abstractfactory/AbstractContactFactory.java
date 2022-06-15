package contacts.abstractfactory;

/*
    - "Creator" klasa unutar "Factory" pattern-a:
 */
public abstract class AbstractContactFactory {
    public abstract Contact createContact(ContactType contactType);
}
