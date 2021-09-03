package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternativeEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "javajavajava.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + firstName + " " + lastName);

		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + this.password);

		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		System.out.println("Email: " + email);
	}

	public String setDepartment() {
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			return "Sales";
		} else if (choice == 2) {
			return "Development";
		} else if (choice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}

	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	public void showInfo() {
		System.out.println("\n*****SHOW INFO FUNCTION*****");
		System.out.println("DISPLAY NAME: " + this.firstName + " " + this.lastName
				+ "\nCOMPANY EMAIL: " + this.email
				+ "\nALTERNATIVE EMAIL: " + this.alternativeEmail 
				+ "\nPASSWORD: " + this.password
				);
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}

	public String getAlternativeEmail() {
		return this.alternativeEmail;
	}
}
