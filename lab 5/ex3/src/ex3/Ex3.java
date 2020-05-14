package ex3;
import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        int maxSubjects;
      int [] marks = new int[5];
      int total;
      double avg;
      
      total = 0;
      
      try {
          Scanner s = new Scanner(System.in);
          
          System.out.print("Enter Max Subjects : ");
          maxSubjects = s.nextInt();
          
          for(int i=0 ; i< maxSubjects ;i++)
          {
             
              System.out.print("Marks : ");
              marks[i] = s.nextInt();
              
              total =+ marks[i];
          }
           avg = total /maxSubjects;
           
           System.out.println("Total : " + total + " " + "Avg : " + avg ); 
          
      }catch (InputMismatchException e) {
        System.out.println( e.getMessage() );
      }catch (ArithmeticException e) {
        System.out.println( e.getMessage() );
      }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println( e.getMessage() );
      }catch (Exception e) {
        System.out.println( "Exception Occuer" );
      }
      
      finally {
         System.out.println("This code will be gurrentied to run");
      }
    
      System.out.println("The end");
      }
   
}
