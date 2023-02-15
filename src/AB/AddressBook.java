package AB;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:");
		String f = sc.next();
		System.out.println("Second Name:");
		String s = sc.next();
		System.out.println("Address:");
		String ad = sc.next();
		System.out.println("City:");
		String c = sc.next();
		System.out.println("State:");
		String st = sc.next();
		System.out.println("Zip:");
		int z = sc.nextInt();
		System.out.println("Phone Number:");
		int ph = sc.nextInt();
		System.out.println("Email:");
		String m = sc.next();
	}	
}
