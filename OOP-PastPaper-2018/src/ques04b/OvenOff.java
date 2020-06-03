package ques04b;

public class OvenOff implements Command {
	
	private Oven o;
	
	public OvenOff(Oven o) {
		super();
		this.o = o;
	}

	@Override
	public void execute() {
		o.Off();	

	}

}
