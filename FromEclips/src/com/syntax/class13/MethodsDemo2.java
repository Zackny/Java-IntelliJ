package com.syntax.class13;

public class MethodsDemo2 {

	//create amethod that takes an animal name and person name if name is equal to Tayfur and animal is Horse
	//print camel otherwise print Horse.
	void TayfurAndHorse(String person,String animal) {
		if("Tayfur".equals(person)&& "Horse".equals(animal)) {
			System.out.println("This is a camel");
		}else {
			System.out.println("This is Horse");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodsDemo2 obj=new MethodsDemo2();
obj.TayfurAndHorse("Tayfur","Horse");
	}

}
