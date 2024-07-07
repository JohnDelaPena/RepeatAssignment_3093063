package griffith;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 6 Numbers");//Prompt user to input 6 numbers
		Set<String> inputSet= new HashSet<String>();
		int count=0; //
		while(count<6) {
			int input=scan.nextInt();
			if(input<10) { //If the  number input is less than 10,
				inputSet.add(String.valueOf("0"+input));// add 0 before the number for consistency.
			}
			else { //Else if above 10,
				inputSet.add(String.valueOf(input));// just add the number to set as is.
			}
			count++;//Increment count by 1 after each input from the user.
		}
		System.out.println(inputSet);

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

	public int checkWinner() {
		return 0;

	}

	public double prizeWon() {
		return 0;

	}

	public boolean verifyGuesses(HashSet<String>Guesses) {
		return false;

	}
}