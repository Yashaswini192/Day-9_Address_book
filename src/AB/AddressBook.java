package AB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Contact> address  = new ArrayList<>();
	Contact c;
	public void addContact() {

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


		c = new Contact();
		c.setFirstName(FirstName);
		c.setSecondName(SecondName);
		c.setAddress(Address);
		c.setCity(City);
		c.setState(State);
		c.setZip(Zip);
		c.setPhoneNumber(PhoneNumber);
		c.setEmail(Email);


	}

	public String toString() {
		return c.toString();
	}


	public void updateContact( ){

		c = new Contact();
		Scanner s = new Scanner(System.in);
		System.out.println("enter first name to update details:");
		String FirstName = s.nextLine();
		if(s.nextLine() == c.getFirstName()){
			System.out.println("First Name:");
			c.setFirstName(s.next());
			System.out.println("Second Name:");
			c.setSecondName(s.next());
			System.out.println("Address:");
			c.setAddress(s.next());
			System.out.println("City:");
			c.setCity(s.next());
			System.out.println("State:");
			c.setState(s.next());
			System.out.println("Zip:");
			c.setZip(s.nextInt());
			System.out.println("Phone Number:");
			c.setPhoneNumber(s.nextLong());
			System.out.println("Email:");
			c.setEmail(s.next());
		}
		else {
			System.out.print("contact doesnot exist with in the list");
		}
	}

	public void deleteContact() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Firstname to delete contact:");
		String FirstName = scan.next();
		if(scan.next() == (c.getFirstName())) {
			System.out.println("contact deleted");

			c = new Contact();
			c.setFirstName(null);
			c.setSecondName(null);
			c.setAddress(null);
			c.setCity(null);
			c.setState(null);
			c.setZip(0);
			c.setPhoneNumber(null);
			c.setEmail(null);
		}
	}
}

