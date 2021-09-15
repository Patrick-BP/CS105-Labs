package chapter5.Lab10;

public class PersonAddress {
	
	private String firstName,lastName, email, telNumber;
	
	
	public PersonAddress() {
		firstName = "Unknown";
		lastName = "Unknown";
		email = "test@miu.edu";
		telNumber = "6414727000";
		
	}
	public PersonAddress(String firstName, String lastname, String email, String telNumber) {
		
		this.firstName = firstName;
		this.lastName = lastname;
		
		if(email.contains("@") && email.contains("."))
			this.email = email;
		else
			this.email = "test@miu.edu";
		
		
		if(telNumber.length() == 10)
			this.telNumber = telNumber;
		else
			this.telNumber = "6414727000";
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;	
	}
	
	
	public String getlastName() {
		return lastName;	
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;	
	}
	
	public String getEmail() {
		return email;	
	}
	public void setEmail(String email) {
		if(email.contains("@") && email.contains("."))
		this.email = email;
		else
			System.out.println("Invalid input of email ");
	}
	
	public String getTelNumber() {
		
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		if(telNumber.length() == 10)
			this.telNumber = telNumber;	
		else
			System.out.println("Invalid input of telephone number\n");
	}
	
	
	@Override
	public String toString() {
		return " " +firstName + " " + lastName + ", Email: " + email + ", Telephone Number: " + telNumber ;
	}

}
