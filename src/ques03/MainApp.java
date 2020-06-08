package ques03;

public class MainApp {

	public static void main(String[] args) {
		
		
		Student student = new Student(1, "Haritha");
		
		student.input();
		
		System.out.println("Average :"+ student.getAverage());

	}

}
