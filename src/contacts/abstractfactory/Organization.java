package contacts.abstractfactory;

import java.util.Scanner;

/*
    - "Concrete Product" klasa
 */
public class Organization extends Contact {
    private Scanner scanner = new Scanner(System.in);

    private String organizationName;
    private String address;

    public Organization() {
        setOrganizationName();
        setAddress();
        setPhoneNumber();
        setCreatedAt();
        setUpdatedAt();
    }

    public void setOrganizationName() {
        System.out.print("Enter the organization name: ");
        this.organizationName = scanner.nextLine();

    }

    public void setAddress() {
        System.out.print("Enter the address: ");
        this.address = scanner.nextLine();

    }

    @Override
    public void editContact() {
        System.out.print("Select a field (name, address, number): ");
        String selectedOption = scanner.nextLine();

        switch (selectedOption) {
            case "name":
                this.setOrganizationName();
                break;
            case "address":
                this.setAddress();
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
        System.out.println("Organization name: " + this.organizationName +
                "\nAddress: " + this.address +
                "\nNumber: " + this.phoneNumber +
                "\nTime created: " + this.createdAt +
                "\nTime last edit: " + this.updatedAt + "\n");

    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getAddress() {
        return address;
    }
}
