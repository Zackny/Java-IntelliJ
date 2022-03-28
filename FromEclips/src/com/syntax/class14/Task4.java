package com.syntax.class14;

public class Task4 {

	String createEmail(String name, String lname, String emailType) {
		return name + lname + "@" + emailType + ".com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 obj = new Task4();
		String st = obj.createEmail("zack", "zack", "gmail");
		System.out.println(st);
	}

}
