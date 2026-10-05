import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		//pick a random number
		int number = random.nextInt(100) + 1;
		
		//Print instructions
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		
		//read the guess number
		int guessNumber = in.nextInt();
		
		//first guess
		if(number == guessNumber) {
			System.out.println("You got it!");
		} else {
			
			if (number > guessNumber) {
				System.out.println("Bigger!");
			} else {
				System.out.println("Smaller!");
			} 
			
			//second guess
			guessNumber = in.nextInt();	
			
			if(number == guessNumber) {
				System.out.println("You got it!");
			} else {
			
				if (number > guessNumber) {
					System.out.println("Bigger!");
				} else {
					System.out.println("Smaller!");
				} 
				
				//last guess
				guessNumber = in.nextInt();	
			
				if(number == guessNumber) {
					System.out.println("You got it!");
				} else {
					System.out.println("You are out of guesses!");
				} 
			}
		}
	}			
}
