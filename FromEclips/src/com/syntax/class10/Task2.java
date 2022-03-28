package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
	/*Create an array of countries. While retrieving all values from
	 * an array print capital for each country.
	 * 
	 * 	
	 */
		String [] countries= {"Germany","Ukraine","Russia","UK","Poland"};
		for (int i=0; i<countries.length; i++) {
			String capital=null;
			switch(countries[i]) {
			case "Poland":
				 capital  = "Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moskow";
				break;
			case "UK":
			capital="London";
			break;
				
		}
		System.out.println("The caapital of country "+countries[i]+" is "+capital);
		}	
		
		
		
		
		
		
		
		
		
		

	}

}
