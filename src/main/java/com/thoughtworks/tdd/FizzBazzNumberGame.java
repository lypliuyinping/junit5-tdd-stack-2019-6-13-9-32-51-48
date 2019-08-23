package com.thoughtworks.tdd;

public class FizzBazzNumberGame {
	private String word;
	public String fizzBuzz(int number) {
		if (number % 3==0) {
			word= "Fizz";
		}else {
			if (number==1) {
				word="1";
			}
		}
		// TODO Auto-generated method stub
		return word;	
	}

}
