package com.syntax.class14;

public class Task6 {
char getGrade(int score) {
	if(score>=90) {
		return 'A';
	}else if(score>=80 && score<90) {
			return 'B';
	}else if(score>70 && score<80) {
				return 'C';
			}
		
	else {
		return 'F';
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


Task6 task=new Task6();
System.out.println(task.getGrade(75));
	}

}
