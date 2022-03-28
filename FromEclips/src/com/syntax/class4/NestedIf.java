package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("How many doses you have");
			if(dose==1) {
				System.out.println("You need another shot");
			}
			else {
				System.out.println("You are fully vaccineted");
			}
			
		}
	System.out.println("----------------------------------------------------------------");	
		
		boolean allergy=true;
				if (allergy) {
					System.out.println("Let's check what allergies you have");
				String allergyType="pollen";
				
				if (allergyType.equals("pollen")) {
					System.out.println("Pleas stay at home when trees are blooming.Take med A");
				}
				else if(allergyType.equals("peanut")) {
					System.out.println("Please do not eat food with nuts");
				}
				else if(allergyType.equals("gluten")) {
					System.out.println("Please follow gluten free diet.Take med C.");
				}
				else {
					System.out.println("No seggestions");
				}
				}else {
					System.out.println("You are lucky");
				}		
				
				
				
				
				
				
				}
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

