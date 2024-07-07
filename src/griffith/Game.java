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
		
		return null;
		
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