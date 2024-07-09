package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerateNumbers() {
		Game game = new Game();//Create an instance of game.

		//Test 1: Test that the numbers below 10 have a "0" beside it for consistency.
		Set<String> winningNumbers = game.generateNumbers(); // Let winning numbers to be tested equal to the winning numbers in game class.
		for(String number : winningNumbers) {//Create a loop which traverses the set.
			int num = Integer.parseInt(number);//The integer num is the number used to see if the content of the set is below 10.
			if(num<10) { // Test that the numbers below 10 have a "0" before it for consistency.
				assertTrue(number.startsWith("0"),"The numbers below 10 should start with 0 for consistency"); //The result of the test is a true or false.
			}
		}

		//Test 2: Test that the the size of the set is 6.
		assertEquals(6,winningNumbers.size(),"The expected size of the set is 6." );

		//Test 3: Test that the contents  of the set is within the range of 1-99
		for(String number : winningNumbers) { //Create a loop to traverse the set.
			int num = Integer.parseInt(number); //The integer num is the number used to see if the content of the set is below 10.
			assertTrue(num>=1 && num<=100, "The Number " +num +" is not within the range of 1-99."); //This test returns a true or false.
		}
	}


	@Test
	void testCheckWinner() {
		int matches=0;
		int actual=0;
		
		//Test 1: Check if there are any matches
		assertTrue(matches>1);
		
		
	}

	@Test
	void testPrizeWon() {
		fail("Not yet implemented");
	}

	@Test
	void testVerifyGuesses() {
			Game game = new Game();
			Set<String> guesses = game.guesses(); //Create an instance of guess from game class.

			//Test 1: Test that the contents  of the guesses set is within the range of 1-99
			for(String number : guesses) { //Create a loop to traverse the set.
				int num = Integer.parseInt(number); //The integer num is the number used to see if the content of the set is below 10.
				assertTrue(num>=1 && num<=100, "The Guessed number " +num +" is not within the range of 1-99."); //This test returns a true or false.
			}
			//Test 2: Test that the numbers below 10 have a 0 in front of them.
			for(String number2 : guesses) {//Create a loop which traverses the set.
				int num2 = Integer.parseInt(number2);//The integer num is the number used to see if the content of the set is below 10.
				if(num2<10) { // Test that the numbers below 10 have a "0" before it for consistency.
					assertTrue(number2.startsWith("0"),"The numbers below 10 should start with 0 for consistency"); //The result of the test is a true or false.
				}
			}
			
			//Test 3: Test that if the array is less than 6.
			assertTrue(guesses.size()==6);

	}

}

