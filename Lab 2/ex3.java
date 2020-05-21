import java.util.Scanner;

public class ex3{

public static void main(String args[]) {

		  Scanner s= new Scanner(System.in);

		        
	   System.out.println("Enter the length:");

		          double l= s.nextDouble();

		         
          System.out.println("Enter the width:");

		          double w= s.nextDouble();
                                   System.out.println("Enter the height:");

		          double h= s.nextDouble();


		        
      double  volume=l*w*h;

		      System.out.println("Volume of a cube: " + volume); 
     
	}
 
       
 }