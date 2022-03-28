package com.syntax.class6;

public class SwitchDemo2 {

	public static void main(String[] args) {
	
	char choice='l';
	String answer;
	
	switch (choice) {
	case 'y':
		answer="yes";
		break;
	case 'n':
		answer="no";
		break;
	case 'm':
		answer="maybe";
		break;
		default:
			answer="Unknown";
	}
		System.out.println(answer);
		
/*declare the variable to store a car,
 * based on the value of car define the country of origin
 * 
 * 
 * 
 * 		
 */
	String car="LADA";
	String country;
	
	switch(car.toLowerCase()) {
	case "bmw":
		country="Germany";
		break;
	case "ford":
		country="usa";
		break;
	case "lada":
	country="Russia";
	    break;
	case "Toyota":
		country="Japan";
		break;
		default:
			country="Unknown";

	}
		System.out.println(country);
		
		
		
		
		
	}

}
