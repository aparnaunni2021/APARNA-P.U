

	import java.util.Scanner;
	public class customere{
		
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your mobile number :");
	        String mobilenumber=scanner.next();

	        if (mobilenumber.length() <=10) {
	            System.out.println("Welcome to customer service");
	        } else {
	            System.out.println("Invalid mobile number. Please enter a valid number.");
	            
	        System.exit(0);
	        }
	   
	        
			System.out.println("1. Report an issue");
			System.out.println("2. Know about previous request");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please wait while connecting to our representative &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				break;
			case 2:
				System.out.println("Enter your request ID:");
				int requestId = scanner.nextInt();
				System.out.println("Fetching information for request ID: " + requestId);
				break;
			case 3:
				System.out.println("Thank you for contacting us.");
				break;
			default:
				System.out.println("Please select a valid number.");
			}

			scanner.close();
		}

}
