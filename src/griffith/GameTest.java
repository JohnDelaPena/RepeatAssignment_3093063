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
					assertTrue(number.startsWith("0")); //The result of the test is a true or false.
				}
		 }
	}

	@Test
	void testCheckWinner() {
		fail("Not yet implemented");
	}

	@Test
	void testPrizeWon() {
		fail("Not yet implemented");
	}

	@Test
	void testVerifyGuesses() {
		fail("Not yet implemented");
	}

}
