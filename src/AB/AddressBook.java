package AB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

	HashMap<String,ArrayList> multipleAddressBook = new HashMap<>();

	ArrayList<AddressBook> contactlistnum = new ArrayList<>();

	Contact c;

	public ArrayList<Contact> addContact() {
		//AddressBook book;
		ArrayList<Contact> temp = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details to add Contact");

		System.out.println("First Name:");
		String FirstName = sc.next();

		System.out.println("Second Name:");
		String SecondName = sc.next();

		System.out.println("Address:");
		String Address = sc.next();

		System.out.println("City:");
		String City = sc.next();

		System.out.println("State:");
		String State = sc.next();

		System.out.println("Zip:");
		int Zip = sc.nextInt();

		System.out.println("Phone Number:");
		Long PhoneNumber = sc.nextLong();

		System.out.println("Email:");
		String Email = sc.next();


		c = new Contact(FirstName,SecondName,Address,City, State,Zip,PhoneNumber,Email);
		temp.add(c);
		return temp;
	}

	public String toString() {
		return c.toString();
	}

	public HashMap<String, ArrayList> display() {
		for(int i = 0; i < multipleAddressBook.size();i++ ) {
			if( multipleAddressBook.get(i) != null) {
				System.out.println(multipleAddressBook.get(i));
			}
		}
		return multipleAddressBook;
	}

	public void updateContact(ArrayList<AddressBook> x ){

		Scanner s = new Scanner(System.in);
		System.out.println("enter first name to update details:");
		String FirstName = s.nextLine();

		for(int i =0; i < x.size(); i++) {

			String Check1 = x.get(i).c.getFirstName();

			if(s.nextLine() == c.getFirstName()){
				System.out.println("First Name:");
				x.get(i).c.setFirstName(s.next());

				System.out.println("Second Name:");
				x.get(i).c.setSecondName(s.next());

				System.out.println("Address:");
				x.get(i).c.setAddress(s.next());

				System.out.println("City:");
				x.get(i).c.setCity(s.next());

				System.out.println("State:");
				x.get(i).c.setState(s.next());

				System.out.println("Zip:");
				x.get(i).c.setZip(s.nextInt());

				System.out.println("Phone Number:");
				x.get(i).c.setPhoneNumber(s.nextLong());

				System.out.println("Email:");
				x.get(i).c.setEmail(s.next());

				System.out.println("Updated contact");
			}
			else {
				System.out.print("contact doesnot exist with in the list");
			}
		}
	}
	public void deleteContact(ArrayList<Contact> x) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Firstname to delete contact:");
		String FirstName = scan.next();

		for(int i =0 ; i < x.size(); i++) {
			String Check1 = x.get(i).getFirstName();

			if(scan.next() == (c.getFirstName())) {
				System.out.println("contact deleted");


				c.setFirstName(null);
				c.setSecondName(null);
				c.setAddress(null);
				c.setCity(null);
				c.setState(null);
				c.setZip(0);
				c.setPhoneNumber(null);
				c.setEmail(null);
			}

			else{
				System.out.println("Contact Name not found Please enter valid name");
			}
		}
	}

	public void multipleAddressBook(){
		Scanner sc =  new Scanner(System.in);

		System.out.println("Please Enter Address book name");
		String addressBookName = sc.nextLine();

		multipleAddressBook.put(addressBookName,addContact());

		multipleAddressBook.toString();
	}

	public void addressBookManagement(){
		System.out.println("To create new Address Book press 1\nTo Update Existing Address book press 2\nTo view Address book press 3\nTo close system press 4");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num == 1){
			multipleAddressBook();
			addressBookManagement();
		} 
		else if (num == 2) {
			System.out.println("Enter Address Book Name");
			Scanner scn = new Scanner(System.in);
			String checkName = scn.nextLine();
			contactManagement(checkName);
			addressBookManagement();
		} 
		else if (num == 3) {
			System.out.println("\nTo print all address book press 1\nTo print specific address book press 2 ");
			Scanner scn = new Scanner(System.in);
			int num2 = scn.nextInt();

			if(num2 == 1) {
				System.out.println(multipleAddressBook);
				//System.out.println(multipleAddressBook);
			}
			else if (num2 == 2) {
				System.out.println("Enter Address book Name");
				Scanner scan = new Scanner(System.in);
				String checkName = scan.nextLine();
				System.out.println(multipleAddressBook.get(checkName));
			}
			else {
				System.out.println("Invalid Input");
			}
			addressBookManagement();
		}
		else{
			System.out.println("System Closed");
			System.exit(0);
		}
	}

	private void contactManagement(String x) {
		// TODO Auto-generated method stub
		ArrayList l = multipleAddressBook.get(x);

		Scanner sc =  new Scanner(System.in);

		System.out.println("\n\nTo Add new contact to Address book press 1\nTo edit contact press 2\nTo delete contact from address book press 3\n To check for duplicate contact in addressbook press 4\nTo close this Address book Enter 5");
		int check = sc.nextInt();
		switch(check) {
		case 1 : ArrayList<Contact> temp = addContact();
		multipleAddressBook.get(x).add(temp);
		contactManagement(x);
		break;
		case 2 :
			updateContact(l);
			contactManagement(x);
			break;
		case 3 :
			deleteContact(l);
			contactManagement(x);
			break;
		case 4 :
			checkDuplicates();
			break;
		case 5 :
			System.out.println("This Address book closed");
			addressBookManagement();
			break;
		default:
			System.out.println("Invalid Input");
			contactManagement(x);

		}
	}

	public void checkDuplicates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();

		Iterator iterator = contactlistnum.iterator();

		if(firstName.equals(c.getFirstName())) {
			System.out.println("Contact is Already there in addressbook");
			return;
		}
	}














}