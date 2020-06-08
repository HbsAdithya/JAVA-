package ques04b;

public class Oven {
	
	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}
	public void On () {
		System.out.println(name + " Switch on! ");
	}
	public void Off () {
		System.out.println(name + " Switch off! ");
	}
	

}
