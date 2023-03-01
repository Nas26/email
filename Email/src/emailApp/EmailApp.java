package emailApp;
import java.util.*;
public class EmailApp {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your first name and last name: ");
		
		String firstname = in.nextLine();
		String lastname = in.nextLine();
		Email em1 = new Email(firstname,lastname);
		System.out.println(em1.showInfo());
		

	}

}
