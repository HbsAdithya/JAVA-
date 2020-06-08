package ques04b;

public class MainApp {

	public static void main(String[] args) {
		
		MobileUI mobile = new MobileUI();
		
		Oven mainOven = new Oven("mainOven");
		GarageGate garageGate = new GarageGate("garageGate");
		
		Command c1 = new OvenOn(mainOven);
		Command c2 = new OvenOff(mainOven);
		Command c3 = new GarageGateOpen(garageGate);
		Command c4 = new GarageGateClose(garageGate);
		
		mobile.setCommand(1, c1);
		mobile.setCommand(2, c2);
		mobile.setCommand(3, c3);
		mobile.setCommand(4, c4);
		
		mobile.commandPressed(1);
		mobile.commandPressed(2);
		mobile.commandPressed(3);
		mobile.commandPressed(4);
		
		

	}

}
