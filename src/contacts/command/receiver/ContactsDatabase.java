package contacts.command.receiver;

import contacts.abstractfactory.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// ovo će da bude "Receiver" klasa (koja sadrži svu logiku):
public class ContactsDatabase {
    private Scanner scanner = new Scanner(System.in);
    private List<Contact> contactList = new ArrayList<>();

    /*
        - metoda za pretragu unutar kontakata
        - pretraga se vrši po broju telefona / nazivu organizacije / imenu i prezimenu osobe
        - mora da se implementira "containsIgnoreCase" metoda za String:
     */
    public void searchContacts() {
        System.out.print("Enter search query: ");
        String query = scanner.next();

        List<Contact> resultContacts = new ArrayList<>();
        List<String> resultsAsStrings = new ArrayList<>();


        contactList.forEach(contact -> {
            if (contact.isPerson()) {
                Person person = convertToPerson(contact);
                if (person.getFullName()
                        .toLowerCase(Locale.US)
                        .contains(query.toLowerCase(Locale.US)) ||
                        person.getPhoneNumber().contains(query)) {

                    resultsAsStrings.add(person.getFullName());
                    resultContacts.add((Contact) person);
                }
            } else {
                    Organization organization = convertToOrganization(contact);
                    if (organization.getOrganizationName()
                            .toLowerCase(Locale.US)
                            .contains(query.toLowerCase(Locale.US)) ||
                            organization.getPhoneNumber().contains(query)) {

                        resultsAsStrings.add(organization.getOrganizationName());
                        resultContacts.add((Contact) organization);
                    }
            }
        });

        System.out.printf("Found %d results:\n", resultsAsStrings.size());

        AtomicInteger listCounter = new AtomicInteger(0);
        resultsAsStrings.forEach(result -> {
            System.out.printf("%d. %s\n", listCounter.incrementAndGet(), result);
        });
        System.out.println();

        searchSubmenu(resultContacts);
    }

    private void searchSubmenu(List<Contact> list) {
        System.out.print("[search] Enter action ([number], back, again):");
        String action = scanner.next();

        switch (action) {
            case "back":
                return;
            case "again":
                searchContacts();
                break;
            default:
                int index = Integer.parseInt(action);
                Contact selectedContact = list.get(index - 1);

                showActionMenu(selectedContact);
        }
    }

    private void showActionMenu(Contact contact) {
        System.out.print("[record] Enter action (edit, delete, menu): ");
        String selectedOption = scanner.next();

        switch (selectedOption) {
            case "edit":
                if (contact.isPerson()) {
                    Person person = convertToPerson(contact);
                    person.editContact();

                    person.setUpdatedAt();
                } else {
                    Organization organization = convertToOrganization(contact);
                    organization.editContact();

                    organization.setUpdatedAt();
                }
                System.out.println("Saved");
                contact.showInfo();
                // vraćanje na ovaj meni:
                showActionMenu(contact);
                break;
            case "delete":
                contactList.remove(contact);
                System.out.println("The record has been deleted!");
                // opet vraćanje na ovaj meni:
                //showActionMenu(contact);
                //break;
                return;
            case "menu":
                return;
            default:
                System.out.println("Invalid option!");
        }
    }

    private Organization convertToOrganization(Contact contact) {
        return (Organization) contact;
    }

    private Person convertToPerson(Contact contact) {
        return (Person) contact;
    }


    public void listAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Currently, there are no contacts in the list!");
            return;
        }

        for (Contact contact : contactList) {
            if (contact.isPerson()) {
                Person personContact = convertToPerson(contact);

                System.out.printf(
                        "%d. %s %s\n",
                        contactList.indexOf(contact) + 1,
                        personContact.getFirstName(),
                        personContact.getLastName()
                );
            } else {
                Organization organizationContact = convertToOrganization(contact);

                System.out.printf(
                        "%d. %s\n",
                        contactList.indexOf(contact) + 1,
                        organizationContact.getOrganizationName()
                );
            }
        }

        System.out.print("\n[list] Enter action ([number], back): ");
        String input = scanner.next().trim();

        if (input.equals("back")) {
            return;
        }

        int selectedOption = Integer.parseInt(input) - 1;
        // provjera da li je ispravan indeks:
        if (selectedOption < 0 || selectedOption > contactList.size() - 1) {
            System.out.println("Invalid option!");
            return;
        }

        // odabir kontakta iz liste, prema indeksu:
        Contact selectedContact = contactList.get(selectedOption);

        if (selectedContact.isPerson()) {
            Person selectedPerson = convertToPerson(selectedContact);
            selectedPerson.showInfo();
        } else {
            Organization selectedOrganization = convertToOrganization(selectedContact);
            selectedOrganization.showInfo();
        }
        showActionMenu(selectedContact);
    }

    // metoda koja prikazuje broj kontakata unutar imenika:
    public void countAllContacts() {
        System.out.printf("The Phone Book has %d records.\n", contactList.size());
    }

    // metoda za dodavanje novih kontakata:
    public void addContact() {
        System.out.print("Enter the type (person, organization): ");
        String contactType = scanner.next().toLowerCase();

        List<String> submenuOptions = List.of("person", "organization");

        if (!submenuOptions.contains(contactType)) {
            System.out.println("Invalid option!");
            return;
        }

        // upotreba "Factory" pattern-a prilikom pravljenja kontakata:
        ContactFactory factory = new ContactFactory();

        switch (contactType) {
            case "person":
                Contact personContact = factory.createContact(ContactType.PERSON);
                this.contactList.add(personContact);
                break;
            case "organization":
                Contact organizationContact = factory.createContact(ContactType.ORGANIZATION);
                this.contactList.add(organizationContact);
                break;
        }

        System.out.println("The record added.\n");
    }
}
