package AB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {

	HashMap<String,ArrayList> multipleAddressBook = new HashMap<>();

	//ArrayList<Contact> contactlistnum = new ArrayList<>();

	Contact c;
	public ArrayList<Contact> addContact() {
		
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


		Contact c = new Contact(FirstName,SecondName,Address,City, State,Zip,PhoneNumber,Email);
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

	public void addressBookManagement() throws Exception{
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

	private void contactManagement(String x) throws Exception {
		// TODO Auto-generated method stub
		ArrayList l = multipleAddressBook.get(x);

		Scanner sc =  new Scanner(System.in);

		System.out.println("\n\nTo Add new contact to Address book press 1 "
				+ "\nTo edit contact press 2 \nTo delete contact from address book press 3 "
				+ "\nTo check for duplicate contact in addressbook press 4 "
				+ "\nTo Search person in a city or state press 5 "
				+ "\n To get number of contacts searched by city or state press 6"
				+"\n To get the contacts in alphabetical order press 7"
				+"\n To write into File press 8"
				+"\n To read From File press 9"
				+ "\nTo close this Address book Enter 10");
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
			searchPersonInACityOrState();
			break;
		case 6:
			countOfContacts();
			break;
		case 7:
			alphabeticalSort();
			break;
		case 8:
			writeIntoFile();
			break;
		case 9:
			readFromFile();
			break;
		case 10 :
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

		if(firstName.equals(c.getFirstName())) {
			System.out.println("Contact is Already there in addressbook");
			return;
		}
	}

	public void searchPersonInACityOrState() {

		Scanner sc = new Scanner(System.in);		
		System.out.println("1 : Search by city name \n2: Search by state name");
		int option = sc.nextInt();
		switch (option){
		case 1 :
			System.out.println("Enter city Name");
			String city = sc.next();
			for (String key : multipleAddressBook.keySet()) {
				ArrayList<Contact> temp = multipleAddressBook.get(key);
				temp.stream().filter(a -> a.getCity().equalsIgnoreCase(city)).forEach(y -> System.out.println("Address book Name : "+key + "\n"+y + "\n"));
			}
			break;
		case 2 :
			System.out.println("Enter State:");
			String state = sc.next();
			for (String key : multipleAddressBook.keySet()) {

				ArrayList<Contact> temp = multipleAddressBook.get(key);
				temp.stream().filter(a -> a.getState().equalsIgnoreCase(state)).forEach(y -> System.out.println("Address book Name : "+key + "\n"+y + "\n"));
			}
			break;
		}
	}

	public void countOfContacts() {

		Scanner sc = new Scanner(System.in);		
		System.out.println("1 : Search by city name \n2: Search by state name");
		int option1 = sc.nextInt();
		switch (option1){
		case 1 :
			System.out.println("Enter city Name");
			String city = sc.next();
			//try {
			for (String key : multipleAddressBook.keySet()) {
				List<Contact> temp = multipleAddressBook.get(key);
			//}
			//catch(ClassCastException e) {
				System.out.println(temp.stream().filter(a -> a.getCity().equalsIgnoreCase(city)).count());
			//}
			}
			break;
		case 2 :
			System.out.println("Enter state Name");
			String state = sc.next();
			for (String key : multipleAddressBook.keySet()) {
				List<Contact> temp = multipleAddressBook.get(key);
				System.out.println(temp.stream().filter(a -> a.getState().equalsIgnoreCase(state)).count());
			}
			break;	
		}
	}

	public void alphabeticalSort(){

		for (String key : multipleAddressBook.keySet()) {
			List<Contact> temp = multipleAddressBook.get(key);
			List sortedList = temp.stream().sorted((f, s)-> f.getFirstName().compareTo(s.getFirstName())).collect(Collectors.toList());
			System.out.println("Address book : "+key+"\nAfter Sorting Alphabetically : " +sortedList);
		}
	}
	
	public void writeIntoFile() throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Bridgelabz course\\Day9-AddressBook\\Addressbook.txt"));
		for(Map.Entry<String,ArrayList>entry : multipleAddressBook.entrySet()){
	        bw.write(entry.getKey() + ":" +entry.getValue());
	    }
	    bw.flush();
	    bw.close();
	    
	}

	public void readFromFile() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("D:\\Bridgelabz course\\Day9-AddressBook\\Addressbook.txt"));
		 String r;
	        while(( r= br.readLine()) != null){
	            System.out.println(r);
	        }
	        br.close();
	    }
	}

	


