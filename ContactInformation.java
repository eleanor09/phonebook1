
public  class ContactInformation {
	
	protected String firstName;
	protected String lastName;
	protected Address address = new Address();
	protected String phoneNumber;
		
		
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ContactInformation() 
	{}
				
	

	public ContactInformation(String firstName, String lastName, Address address, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	@Override
	public String toString() {
		return  firstName + "\n" + lastName + "\n" + address
				+ "\n" + phoneNumber ;
	}

	
	
	
	

	
	
	
	

}
