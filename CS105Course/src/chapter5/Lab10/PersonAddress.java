package chapter5.Lab10;
public class PersonAddress {
	
	// declaring all instance fields
	private String firstName,lastName, email, telNumber;
	
	// Default Constructor
	public PersonAddress() {
		firstName = "Unknown";
		lastName = "Unknown";
		email = "test@miu.edu";
		telNumber = "6414727000";
		
	}
	
	// Parameterized constructor
	public PersonAddress(String firstName, String lastname, String email, String telNumber) {
		
		this.firstName = firstName;
		this.lastName = lastname;
		// validating email and telNumber data
		this.email = (email.contains("@") && email.contains("."))? email : "test@miu.edu";
		this.telNumber = (telNumber.length() == 10) ? telNumber : "6414727000";	
	}
	
	// Getters and setters for First name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;	
	}
	
	// Getters and Setters for Last name
	public String getlastName() {
		return lastName;	
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;	
	}
	
	// Getters and Setters for Email
	public String getEmail() {
		return email;	
	}
	public void setEmail(String email) {
		this.email = (email.contains("@") && email.contains(".")) ? email : "Invalid input of email ";
	}
	
	// Getters and Setters for Telephone Number 
	public String getTelNumber() {
		
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = (telNumber.length() == 10) ? telNumber : "Invalid input of telephone number\n";	
		
	}
	
	// overriding toString() method
	@Override
	public String toString() {
		return " " +firstName + " " + lastName + ", Email: " + email + ", Telephone Number: " + telNumber ;
	}

}
