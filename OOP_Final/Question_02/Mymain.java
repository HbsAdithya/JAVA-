import java.util.HashMap;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Double> doublevalues = new HashMap<Double>();
        HashMap<Integer> integers = new HashMap<Integer>();
		
		for(double i = 1; i < 5.5; i += 0.5)
			doublevalues.add(i);
		
		for(int j = 1; j < 10; j++)
			integers.add(j);
			
		MyMathClass<Double> object1 = new MyMathClass<Double>();
		System.out.println("Key values: " +  object1.ConverTo(doublevalues));
		
		MyMathClass<Integer> object2 = new MyMathClass<Integer>();
		System.out.println("Avarage value: " + object2.ConverTo(integers));
	}
	
	

}
