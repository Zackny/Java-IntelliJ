package com.syntax.class12;

public class Dog {
// attributes, fields, properties
	String name;
	String color;
	String breed;
	String gender;
	int age;
	double weight;
	//behaviors,functions,methods
void bark() {
	System.out.println("Dog is barking");
}	
	void eat() {
		System.out.println("Dog is eating");  // <-----defining
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
	//creating an object smugls from class Dog	
	Dog smugls= new Dog();
	//Dog is a class
	//smugls is an object
	//= is assignment operator
	//new is a keyword that we use to create the object of a class
	//Dog() we are calling the constructor of the class
		//Scanner scan=new Scanner(System.in);
	smugls.bark();	
	smugls.eat();    // <----calling behavior
	smugls.sleep();

	}

}
