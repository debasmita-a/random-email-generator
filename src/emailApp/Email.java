package emailApp;

import java.util.Scanner;

public class Email {

	//private class properties
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//Constructor to receive the firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		//Call for a method asking for department name - we don't want to other methods to be public
		this.department = setDepartment();
		//System.out.println("Department selected: "+this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: "+this.email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("New joinee :" + firstName + "\nDepartment codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department code:");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {
			return "sales";
		}else if(deptChoice == 2) {
			return "dev";
		}else if(deptChoice == 3) {
			return "acc";
		}else {
			return "";
		}
	}
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%&";
		char password[] = new char[length];
		for(int i =0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}	
	public String getAlternateEmail() {return alternateEmail;}	
	public String getPassword() {return password;}
	
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: "+ mailboxCapacity + "mb";
	}
}
