package com.thoughtworks.tdd;

public class FizzBazzNumberGame {
	private String word;

	public String fizzBuzz(int number) {
		if (number % 3 == 0) {
			word = "Fizz";
			return word;
		}
		if (number == 1) {
			word = "1";
			return word;
		}

		if (number % 5 == 0) {
			word = "Buzz";
			return word;
		}
		if (number % 7 == 0) {
			word = "Whizz";
			return word;
		}
		// TODO Auto-generated method stub
		return number + "";

	}
}
