package ex2;
public class Ex2 {
    public static void main(String[] args) {
      ICompute ob1 = new Person("Danushka",40000.00, 1000.00, 5.00);
      ob1.calculate();
      ob1.display();
      
      ICompute ob2 = new Box(10, 20, 30);
      ob2.calculate();
      ob2.display();
    }
}
