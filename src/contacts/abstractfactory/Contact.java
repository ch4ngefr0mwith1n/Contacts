package contacts.abstractfactory;

import java.time.LocalDateTime;
import java.util.Scanner;

/*
    - "Product" klasa, ona predstavlja interfejs za proizvode koje "factory" metoda kreira:
 */
public abstract class Contact {
    Scanner scanner = new Scanner(System.in);
    protected String phoneNumber;
    protected String createdAt;
    protected String updatedAt;

    public abstract void editContact();
    public abstract void showInfo();

    public Contact() {
    }

    /*
        - postavljanje vrijednosti za broj telefona
        - ukoliko se broj ne uklapa u regex, imaće vrijednost "[no number]"
    */
    public void setPhoneNumber() {
        System.out.print("Enter the number: ");
        String phoneNumber = scanner.nextLine();
        // regex za brojeve telefona:
        String regex = "^\\+?(\\(\\w+\\)|\\w+[ -]\\(\\w{2,}\\)|\\w+)([ -]\\w{2,})*";
        if (phoneNumber.matches(regex)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";
        }
    }

    // potreban je poseban format za datum i vrijeme:
    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now().withSecond(0).withNano(0).toString();
    }

    // potreban je poseban format za datum i vrijeme:
    public void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now().withSecond(0).withNano(0).toString();
    }

    /*
        - u nekim metodama će trebati da se utvrdi da li se radi o "Person" ili "Organization" klasi
        - koristiću Java reflection i Runtime type check:
     */
    public boolean isPerson() {
        return this.getClass() == Person.class;
    }

    // -------------> GETTERI <-------------
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
