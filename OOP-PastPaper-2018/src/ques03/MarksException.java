package ques03;

public class MarksException extends Throwable {
	
	private float marks;

	public MarksException(float marks) {
		super();
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}
	

}
