import java.util.Scanner;
import java.io.*;

public class ex4{
public static void main(String args[])throws IOException
  {
  double width;
  double height;
  double length;
  double volume;
  
  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
  
  System.out.println("Enter the length :");
  length=Double.parseDouble(reader.readLine());
  System.out.println("Enter the width :");
  width=Double.parseDouble(reader.readLine());
  System.out.println("Enter the height :");
  height=Double.parseDouble(reader.readLine());
  
  volume=length*width*height;
  System.out.println("volume is :"+volume);
  }
}