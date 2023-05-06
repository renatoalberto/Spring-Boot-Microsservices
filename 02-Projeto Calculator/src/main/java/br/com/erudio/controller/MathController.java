package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;


@RestController
public class MathController {
	
	@Autowired
	private SimpleMath simpleMath;
	
	@Autowired
	private NumberConverter numberConverter;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!numberConverter.isNumeric(numberOne)  ||  !numberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.sum(numberConverter.convertDouble(numberOne), numberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method =RequestMethod.GET)
	public Double less(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.subtraction(numberConverter.convertDouble(numberOne), numberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method =RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.multiplication(numberConverter.convertDouble(numberOne), numberConverter.convertDouble(numberTwo));
	}	
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method =RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.division(numberConverter.convertDouble(numberOne), numberConverter.convertDouble(numberTwo));
	}	
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}", method =RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.mean(numberConverter.convertDouble(numberOne), numberConverter.convertDouble(numberTwo));
	}	
	
	@RequestMapping(value="/squareRoot/{numberOne}", method =RequestMethod.GET)
	public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!numberConverter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Favor informe valores numéricos");
		}
		
		return simpleMath.squareRoot(numberConverter.convertDouble(numberOne));
	}	

}



