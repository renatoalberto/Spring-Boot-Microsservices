package br.com.erudio.request.converters;

import org.springframework.stereotype.Service;

@Service
public class NumberConverter {
	public Double convertDouble(String strNumber) {
		if (!isNumeric(strNumber)) {
			return 0D;
		}
		
		String number = strNumber.replaceAll(",", ".");
		return Double.parseDouble(number);
	}
	
	public boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]+\\.?[0-9]*");
	}
}
