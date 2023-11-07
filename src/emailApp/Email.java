package emailApp;

import java.util.Scanner;

public class Email {

	//private class properties
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		//Call for a method asking for department name - we don't want to other methods to be public
		this.department = setDepartment();
		System.out.println("Department selected: "+this.department);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department code:");
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
		return null;
	}
	//Set mailbox capacity
	
	//Set alternate email
	
	//Change the password 
	
	
	
}
