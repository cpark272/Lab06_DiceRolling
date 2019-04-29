import java.util.Random;
import java.util.Scanner;

public class Lab06Program {

	public static void main(String[] args) {
		
		// Starts Scanner class
		Scanner scan = new Scanner(System.in);
		
		// Title of program
		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		// Initializes string
		String userInput = null;
		int i = 1;
		
		// Do-while loop to let the user decide how many times to roll
		do {
			// Input side of the dice
			System.out.print("How many sides should each die have? ");
			int n = scan.nextInt();
			
			// Output the results
			System.out.println("\nRoll " + i + ":");
			System.out.println(generateRandomDieRoll(n));
			System.out.println(generateRandomDieRoll(n));

			// Asks if the user wants to continue using the program
			System.out.print("\nRoll again? (y/n): ");
			userInput = scan.next();
			
			//Increments the roll number
			i++;
			
			// Seperates each new attempt
			System.out.print("\n");
			
		} while (userInput.equalsIgnoreCase("y"));

	}
	
	// This method will calculate the random results of the dice roll
	public static int generateRandomDieRoll(int x) {
		
		// New random number generator
		Random randNum = new Random();
		
		// Returns value back to main
		return randNum.nextInt(x) + 1;
		
	}
	

}
