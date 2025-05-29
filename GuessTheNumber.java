package guess;
import java.util.*;
public class GuessTheNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
	
		int chance =  10 , attempt = 0 ,guessNumber;
		int randomNumber = random.nextInt(100)+1;
		
		  System.out.println(" Welcome to the Number Guessing Game!");
	      System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
		
		do {
			
			System.out.println("Guess a number between 10 to 100");
			guessNumber = sc.nextInt();
			attempt++;
			
			
			  if (guessNumber < randomNumber) {
				  chance--;
	                System.out.println("Too low! Try again.");
	                System.out.println("Remaining chances "+chance);
	            } else if (guessNumber > randomNumber) {
	            	chance--;
	                System.out.println("Too high! Try again.");
	                System.out.println("Remaining chances "+chance);
	                chance--;
	            } else {
	                System.out.println(" Correct! You guessed the number in " + attempt + " attempts.");
	            }
		}
		while(guessNumber != randomNumber);
		sc.close();
		
	}

}
