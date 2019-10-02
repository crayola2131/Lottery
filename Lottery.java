import java.util.Scanner; 
public class Lottery {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lottery =  (int)(Math.random()*100);
		//use Math.random method to generate a random lottery number between 0-99 to check against the user guess
		
		System.out.println("Enter an integer between 0 and 99: ");
		
		int guess = input.nextInt();
		
		//parse the lottery number into 2 digits: lottery1 and lottery2
		int lottery1 = (lottery / 10);
		int lottery2 =(lottery % 10);
		
		
		//parse the guess number into 2 digits 
		int guess1 = (guess / 10);
		int guess2 = (guess % 10);
		
		System.out.println("The winning number is " + lottery);
		System.out.println("Your guess is " + guess);
		
		if(lottery1 == guess1 ^ lottery2 == guess2) {
			System.out.println("You only matched one digit in the correct postion");
			System.out.println("Congratulations, you have won 1,000 dollars!");
		}
		else if(lottery1 == guess2 && lottery2 == guess1) {
			System.out.println("You matched both digits but not in order");
			System.out.println("Congratulations, you have won 3,000 dollars!");
		}
		else if(lottery == guess) {
			System.out.println("Perfect Match!");
			System.out.println("Congratulaions, you have won 10,000 dollars!");
		}
		else {
			System.out.println("Sorry you are not a winner, try again");
			
			input.close();
		
		}
		
		
		
	}

}
