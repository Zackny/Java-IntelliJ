package com.syntax.class12;

public class Phone {

	String make;
	String model;
	int noCameras;
	String color;
	double screenSize;
	String os;

	void makeCall() {
		System.out.println("Making a call");
	}

	void takePictures() {
		System.out.println("Taking pictures");
	}
	void printCompleteInfo() {
		System.out.println("make "+make);
		System.out.println("model "+model);
		System.out.println("noCAmeras "+noCameras);
		System.out.println("color "+color);
		System.out.println("os "+os);
		System.out.println("screenSize "+screenSize);
	}   

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "iphone 13";
		iphone.noCameras = 3;
		iphone.color = "blue";
		iphone.screenSize = 6.8;
		iphone.os = "IOS";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteInfo();
		System.out.println("-----------------------------------------");
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="Galaxy 20";
		samsung.noCameras=2;
		samsung.color="black";
		samsung.screenSize=6.8;
		samsung.os="android";
		samsung.makeCall();
		samsung.takePictures();
		samsung.printCompleteInfo();
		System.out.println("------------------------------------------------");
		Phone pixel=new Phone();
		pixel.make="Pixel";
		pixel.model="Pixel 6";
		pixel.noCameras=3;
		pixel.color="black";
		pixel.screenSize=6.8;
		pixel.os="android";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();
		
	}

}
