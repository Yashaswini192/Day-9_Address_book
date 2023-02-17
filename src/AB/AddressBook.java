package AB;

import java.util.Scanner;

public class AddressBook {
	Contact c ;
	public void addContact() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details");
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


		c = new Contact() ;
		c.setFirstName(FirstName);
		System.out.println(c.getFirstName());
		c.setSecondName(SecondName);
		System.out.println(c.getSecondName());
		c.setAddress(Address);
		System.out.println(c.getAddress());
		c.setCity(City);
		System.out.println(c.getCity());
		c.setState(State);
		System.out.println(c.getState());
		c.setZip(Zip);
		System.out.println(c.getZip());
		c.setPhoneNumber(PhoneNumber);
		System.out.println(c.getPhoneNumber());
		c.setEmail(Email);
		System.out.println(c.getEmail());
	}

	public String toString() {
		return c.toString();
	}

	
	public void updateContact( ){
		
	    c = new Contact();
		Scanner s = new Scanner(System.in);
		System.out.println("enter first name to update details:");
		String Name = s.nextLine();
		if(c.getFirstName() == (c.getFirstName())) {
			System.out.println("First Name:");
			c.setFirstName(s.next());
			System.out.println("Second Name:");
			c.setSecondName(s.next());
			//System.out.println(c.getSecondName());
			System.out.println("Address:");
			c.setAddress(s.next());
			//System.out.println(c.getAddress());
			System.out.println("City:");
			c.setCity(s.next());
			//System.out.println(c.getCity());
			System.out.println("State:");
			c.setState(s.next());
			//System.out.println(c.getState());
			System.out.println("Zip:");
			c.setZip(s.nextInt());
			//System.out.println(c.getZip());
			System.out.println("Phone Number:");
			c.setPhoneNumber(s.nextLong());
			//System.out.println(c.getPhoneNumber());
			System.out.println("Email:");
			c.setEmail(s.next());
			//System.out.println(c.getEmail());
		}
	}
	
	public void deleteContact() {
		System.out.println("enter name to delete contact:");
		
	}

}
