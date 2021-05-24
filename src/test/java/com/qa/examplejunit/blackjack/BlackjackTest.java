package com.qa.examplejunit.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackTest {
	
	@Test
	public void flopTest() {
		int flopHand = 22;
		int actualResult = Blackjack.play(flopHand, flopHand);
		int expectedResult = 0;
		 
		assertEquals(expectedResult, actualResult);
	} 
	
	@Test
	public void dealerFlopTest() {
		int flopHand = 22;
		int playerHand = 19;
		int actualResult = Blackjack.play(flopHand, playerHand);
		 
		assertEquals(playerHand, actualResult);
	}
	
	@Test
	public void playerLosesTest() {
		int flopHand = 22;
		int dealerHand = 18;
		
		int actualResult = Blackjack.play(dealerHand, flopHand);
		
		assertEquals(dealerHand, actualResult);
	}
	@Test
	public void playerWinTest() {
		int playerHand = 21;
		int dealerHand = 19;
		int actualResult = Blackjack.play(dealerHand, playerHand);
		
		assertEquals(playerHand, actualResult);
	}
	
	@Test 
	public void dealerWinTest() {
		int playerHand = 19;
		int dealerHand = 21;
		int actualResult = Blackjack.play(dealerHand, playerHand);
		
		assertEquals(dealerHand, actualResult);
	}
}
