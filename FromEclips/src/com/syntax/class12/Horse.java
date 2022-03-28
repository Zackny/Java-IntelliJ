package com.syntax.class12;

public class Horse {
	// attributes
	String name;
	String breed;
	int age;
	double weight;

	// behaviers
	void run() {
		System.out.println(name + " is running");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void printCompleteInfo() {

		System.out.println("breed =" + breed);
		System.out.println("age =" + age);
		System.out.println("name =" + name);
		System.out.println("weight =" + weight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse munja = new Horse();
		munja.name = "spirit";
		munja.breed = "stallion";
		munja.age = 20;
		munja.weight = 400;
		munja.run();
		munja.printCompleteInfo();
		
		
		System.out.println("-----------------------------------");
		Horse mojKonj = new Horse();
		mojKonj.name = "Tuzik";
		mojKonj.breed = "Mustang";
		mojKonj.age = 10;
		mojKonj.weight = 450;
		mojKonj.run();
		mojKonj.printCompleteInfo();
	}

}
