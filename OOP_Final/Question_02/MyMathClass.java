import java.util.HashMap;

public class MyMathClass <T,V extends Number> {
	T obj1;
	V obj2;
	
	
	public MyMathClass(T obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	
	public T getObj1() {
		return obj1;
	}


	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}


	public V getObj2() {
		return obj2;
	}


	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}


	public void Average(HashMap<T,V> Number) {
		double average =0;
		
		System.out.println("Average is " + average);
		
	}
	
	public void convertTo() {
		
		
	}
	
}
