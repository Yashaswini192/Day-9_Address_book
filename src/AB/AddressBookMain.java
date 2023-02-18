package AB;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		AddressBook addressbook = new AddressBook();
		addressbook.addContact();
		System.out.println(addressbook.toString());

		addressbook.updateContact();
		System.out.println(addressbook.toString());

		addressbook.deleteContact();
		System.out.println(addressbook.toString());
	}

}
