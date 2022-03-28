package com.syntax.class14;

public class HomeWork {

	/*
	 * Accept username, password and confirm password from a user and check
	 * following requirements: Username and Password cannot be empty, if so→
	 * message=”Username and Password cannot be empty”. Password should be minimum 8
	 * characters, if less → message=”Password is too short”. Password cannot
	 * contain username if so, → message=”Password cannot contain username”.
	 * Password should match confirmed password, if not → message=“Passwords do not
	 * match”. Only after all requirements met → message “Your username and password
	 * has been created”
	 */
	String login(String username, String password) {

		if (username.isEmpty() || password.isEmpty()) {

			System.out.println("Username and Password cant be empthi");
		}
		if (password.length() < 8) {
			System.out.println("Password is to short");
		}
		if (password.contains(username)) {
			System.out.println("Password cant contein username");
		}
		if (!password.equals(password)) {
			System.out.println("Password do not match");
		}
		return "Username and password created";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork obj = new HomeWork();
        String s=obj.login("zzzzzvvvvvvv", "ooopppork1111");
        System.out.println(s);
	}

}
