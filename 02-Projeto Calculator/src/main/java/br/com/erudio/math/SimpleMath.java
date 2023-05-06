package br.com.erudio.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		Double subtraction;
		
		if (numberOne > numberTwo) {
			subtraction = numberOne - numberTwo;			
		} else {
			subtraction = numberTwo - numberOne;
		}
		
		return subtraction;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}	
	
	public Double mean(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
	public Double squareRoot(Double numberOne) {
		return numberOne * numberOne;
	}		
}
