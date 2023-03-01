package emailApp;
import java.awt.*;
import java.util.*;
public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String alternativeEmail;
	private int defaultPasswordLength=10;
	private int mailboxcapacity=500;
	private String companySuffix = "company.com";
	
	//constructor to receive the first name and last name
	
	public Email(String firstName,String lastName) {
		this.firstName= firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+ this.lastName);
		
		//call a method asking for the department return department
		this.department = setDepartment();
		
		System.out.println("Department: "+this.department);
		
		//call a method that return random password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//combine elements generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		
		//System.out.println("your email is: "+ email);
	}
	
	// ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sale\n2 for Development\n3 for Accounting\n0 for name\n Enter department: ");
		Scanner sc = new Scanner(System.in);
		
		int depChoice =sc.nextInt();
		if(depChoice==1) {
			return "sales";	
		}
		else if(depChoice==2) {
			return "development";
			
		}
		else if(depChoice==3) {
			return "Acctounting";
		}
		else {
			return "name";
		}
		
		
		
	}
	
	// generate random password
	private String randomPassword(int length) {
		String passwordDictionary = "ZXCVBNMASDFGHJKLPOIUYTREWQ1234567890@$&%";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int)(Math.random() * passwordDictionary.length());
			password[i]=passwordDictionary.charAt(rand);
		}
		return new String(password);
		
		
	}
	//set capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity= capacity;
	}
	
	
	//set alternative email
	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail=altEmail;
	}
	
	
	//change the password
public void ChangePassword(String password) {
	this.password = password;
	
}

public int getMailboxCapacity() {
	return mailboxcapacity;
}
public String getAlternativeEmail() {
	return alternativeEmail;
}
public String getPassword() {
	return password;
}
public String showInfo() {
	return "DISPLAY NAME: "+firstName+" "+lastName+
			"\nCOMPANY EMAIL: "+email+
			"\nEMAIL CAPACITY: "+mailboxcapacity+ "mb";
}
}
