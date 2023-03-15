package AB;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		AddressBook addressbook = new AddressBook();

		Scanner scan = new Scanner(System.in);
		addressbook.multipleAddressBook();
        addressbook.addressBookManagement();


		}

	}