package AB;

public class Contact {

	private String FirstName;
	private String SecondName;
	private String Address;
	private String City;
	private String State;
	private int Zip;
	private Long PhoneNumber;
	private String email;


	public Contact(String firstName, String secondName, String address, String city, String state, int zip,
			Long phoneNumber, String email) {
		super();
		FirstName = firstName;
		SecondName = secondName;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
		PhoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getSecondName() {
		return SecondName;
	}


	public void setSecondName(String secondName) {
		SecondName = secondName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public int getZip() {
		return Zip;
	}


	public void setZip(int zip) {
		Zip = zip;
	}


	public Long getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [FirstName=" + FirstName + ", SecondName=" + SecondName + ", Address=" + Address + ", City="
				+ City + ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + ", email=" + email
				+ "]";
	}

		
	}




