package AB;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of contacts you want to add:");
		int totalContact = scan.nextInt();

		AddressBook addressbook = new AddressBook();

		for(int i = 1 ; i <= totalContact ; i++) {
			addressbook.addContact();
			System.out.println(addressbook.toString());
		}

		addressbook.updateContact();
		System.out.println(addressbook.toString());

		addressbook.deleteContact();
		System.out.println(addressbook.toString());
	}

}
