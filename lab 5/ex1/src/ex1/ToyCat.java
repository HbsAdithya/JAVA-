package ex1;
public class ToyCat extends Cat {
    String manufacturer;
    
     public ToyCat() {
             System.out.println("Toycat constructor called");
     }
  
    public ToyCat(String name, String manufacturer) {
     super(name);
     this.manufacturer = manufacturer;
  }
  
    public void display() {
     super.display();
     System.out.println("I am from " + manufacturer + ".");
  }
}
