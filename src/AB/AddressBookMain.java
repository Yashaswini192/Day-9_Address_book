package AB;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

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


		Contact c = new Contact();
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
		System.out.println(c.toString());


	}

}
