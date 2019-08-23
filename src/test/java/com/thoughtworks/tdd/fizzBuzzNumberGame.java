package com.thoughtworks.tdd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class fizzBuzzNumberGame {
	@Test
	public void should_return_1_when_fizzBazz_given_1() {
		// given
		int number = 1;
		FizzBazzNumberGame fizzBuzzNumberGame = new FizzBazzNumberGame();

		// when
		String word = fizzBuzzNumberGame.fizzBuzz(number);

		// then
		Assertions.assertEquals("1", word);
	}
	public void should_return_Fizz_when_fizzBazz_given_3() {
		// given
		int number = 3;
		FizzBazzNumberGame fizzBuzzNumberGame = new FizzBazzNumberGame();

		// when
		String word = fizzBuzzNumberGame.fizzBuzz(number);

		// then
		Assertions.assertEquals("Fizz", word);
	}
	

}
