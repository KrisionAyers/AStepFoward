import java.util.Scanner;
public class AStepFoward {	 
	public static void main(String[] args) {
	
		System.out.println("Hello Class");
		
		//Outline for addition problem.
		
		// Round 1
		// Generate 2 random numbers
		
		int number1 = (int)(Math.random() *10);
		
		int number2 = (int)(Math.random() *10);
		
		// Ask the user to add these two numbers together
		System.out.println
		("What is " + number1 + " + " + number2 + "?");
		
		// Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		// Check if the answer was correct
		//		IF correct
		int correctAnswer = number1 + number2;
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		//			tell them the correct answer
		//			Make the next question easier
		// Round 2
		// Generate 2 random numbers
		// Ask the user to add these two numbers together
		// Read in their response
		// Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		//			tell them the correct answer
		//			Make the next question easier
		

	}

}