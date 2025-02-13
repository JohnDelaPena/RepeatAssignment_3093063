package griffith;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Game game = new Game();
		HashSet<String> winningNumbers = game.generateNumbers(); // Create an instance of generateNumbers.
		//System.out.println("[Test] These are the winning numbers : " +winningNumbers); //Print winning numbers for test.
		HashSet<String> userGuesses = game.guesses();// Create a set ti stire guesses.

		System.out.println("These are the winning numbers: " +winningNumbers); //Display winning numbers.
		System.out.println ("You Guessed : " +userGuesses);//Display guessed numbers

		int matches= game.checkWinner(winningNumbers,userGuesses); //call checkWinner method to get the number of matches.
		double money = game.prizeWon(matches); //Use matches as arguement for prizeWon.
		System.out.println("You got " +matches +" matches and won " +money +" Euros!" ); //Display the matches and money won.
		
	}


	public HashSet <String> generateNumbers() {

		Random rand = new Random();// Create an instance of Random.
		Set<String> winningNumbers = new HashSet<String>();//Create a set to store the winning numbers.
		for(int i= 1; i<7; i++) { // Generates 6 Numbers
			int max=99;// Max number generated is 99.
			int min=1;//Minimum number generated is 1.
			while(winningNumbers.size()<6) { // While loop ensures that 6 numbers are generated.
				int randNum=rand.nextInt(max-min)+1+min;// Generates numbers between 1-99 inclusive.
				if(randNum<10) { //If the random number generated is less than 10,
					winningNumbers.add(String.valueOf("0"+randNum));// add 0 before the number for consistency.
				}
				else { //Else if above 10,
					winningNumbers.add(String.valueOf(randNum));// just add the number to set as is.
				}
			}
		}
		return (HashSet<String>) winningNumbers; 

	}

	public int checkWinner(Set<String>winningNumbers,Set<String>guesses) {
		int matches=0; //Create a variable which stores the amount of matches.
		
		for(String guess: guesses) { //For loop which traverses the array of guesses.
			if(winningNumbers.contains(guess)) { //If winning numbers set contains a guessed number,
				matches++; // matches increments by 1.
			}
		}
			return matches;
	}

	public double prizeWon(int matches) {
		switch (matches) { //Switch takes  in matches.
		//0-3 Matches = 0 prize money
        case 0: return 0;
        case 1: return 0;
        case 2: return 0;
        case 3: return 0;
        case 4: return 20; //4 Matches = 20 euro prize money.
        case 5: return 200; //5 Matches = 200 euro prize money.
        case 6: return 2000;//6 Matches = 2000 euro prize money.
        default: return 0;
		}

	}

	public boolean verifyGuesses(HashSet<String>Guesses) {

		return false;

	}


	public HashSet <String> guesses(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 6 Numbers Between 1-99.");//Prompt user to input 6 numbers
		Set<String> inputSet= new HashSet<String>();
		int count=0; // Create a counter
		while(count<6) { // While the count is less than 6:
			int input=scan.nextInt(); //Take user input.
			if(input<1 || input>99 ){ //If Input is less than 1 and greater than 99.
				System.out.println("Error: Enter 6 Numbers Between 1-99"); //Prompt the user to input numbers withen the range of 1-99.
			}
			else {// If input is valid.
				String formattedInput= (input<10) ? "0" + input :String.valueOf(input); // Ternary operator : if input is less than 10, add 0 before input.
				if(inputSet.contains(formattedInput)) { //If inputset contains a duplicate.
					System.out.println("Duplicate found.Please enter a different number."); //Print Error Message.
				}
				else { //Else
					inputSet.add(formattedInput);// Add inputs from user to set.
					count++; // Counter increments by 1.
					System.out.println(input +" was added as entry " +count +"."); //Display input success message.
				}
			} 

		}
		return (HashSet<String>) inputSet;
	}
}