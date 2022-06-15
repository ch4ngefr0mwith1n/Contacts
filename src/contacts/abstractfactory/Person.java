package contacts.abstractfactory;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/*
    - "Concrete Product" klasa
 */
public class Person extends Contact {

    private Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;

    public Person() {
        setFirstName();
        setLastName();
        setBirthDate();
        setGender();
        setPhoneNumber();
        setCreatedAt();
        setCreatedAt();
        setUpdatedAt();
    }

    public void setFirstName() {
        System.out.print("Enter the name: ");
        this.firstName = scanner.next();
    }

    public void setLastName() {
        System.out.print("Enter the surname: ");
        this.lastName = scanner.next();

        // pomjeranje Scanner-a u novi red:
        scanner.nextLine();
    }

    // metoda za parsiranje datuma preko Stringa:
    public void setBirthDate() {
        try {
            System.out.print("Enter the birth date: (YYYY-MM-DD) ");
            // datum rođenja mora da bude u formatu "YYYY-MM-DD":
            String chosenBirthdate = scanner.nextLine();
            this.birthDate = LocalDate.parse(chosenBirthdate).toString();

        } catch (DateTimeException dateTimeException) {
            System.out.println("Bad birth date!");
            this.birthDate = "[no data]";
        }

    }

    public void setGender() {
        System.out.print("Enter the gender (M, F): ");
        String selectedOption = scanner.nextLine().trim();

        if (selectedOption.equalsIgnoreCase("M") || selectedOption.equalsIgnoreCase("F")) {
            this.gender = selectedOption;
        } else {
            System.out.println("Bad gender!");
            this.gender = "[no data]";
        }
    }

    @Override
    public void editContact() {
        System.out.print("Select a field (name, surname, birth, gender, number): ");
        String selectedOption = scanner.nextLine();

        switch (selectedOption) {
            case "name":
                this.setFirstName();
                break;
            case "surname":
                this.setLastName();
                break;
            case "birth":
                this.setBirthDate();
                break;
            case "gender":
                this.setGender();
                break;
            case "number":
                this.setPhoneNumber();
                break;
            default:
                System.out.println("Invalid option!");
                break;

        }
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + this.firstName +
                "\nSurname: " + this.lastName +
                "\nBirth date: " + this.birthDate +
                "\nGender: " + this.gender +
                "\nNumber: " + this.phoneNumber +
                "\nTime created: " + this.createdAt +
                "\nTime last edit: " + this.updatedAt + "\n");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }


}
