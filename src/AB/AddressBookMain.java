package AB;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		AddressBook addressbook = new AddressBook();

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("Press 1 to AddContact \n Press 2 to updateContact \n Press 3 to Delete Contact");

			int input = scan.nextInt();

			switch(input) {

			case 1 :
				System.out.println("enter the no of contacts you want to add to AddressBook:");
				int totalContact = scan.nextInt();

				for(int i = 1 ; i <= totalContact ; i++) {
					addressbook.addContact();
				}
				addressbook.display();
				break;
			case 2 :
				addressbook.updateContact();
				addressbook.display();
				break;
			case 3 :
				addressbook.deleteContact();
				addressbook.display();
				break;
			default:
				System.out.println("application closing");
				System.exit(0);
			}

		}

	}
}