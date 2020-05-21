import java.util.Scanner;

class EvenOddNumber{
public boolean findEvenorOdd(int i)
{
    if(i%2==1)
     {
     System.out.println("number is odd");
     }
    else
    System.out.println("number is Even");

	return true;
}

public static void main(String args[])
{
	EvenOddNumber eo = new EvenOddNumber();
	eo.findEvenorOdd(5);
}

}