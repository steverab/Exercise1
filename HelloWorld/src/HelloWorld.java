import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		
		HelloUser user = new HelloUser(name);
		user.greetUser();
		
		scanner.close();
	}

}
