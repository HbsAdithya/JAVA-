import java.util.*;

public class ex4
{

	public static void main(String[] args)
	{

		int day;
		
		Scanner s = new Scanner(System.in);

		System.out.print("Value of the day : ");
		day = s.nextInt();

		switch(day)
		{

			case 1:System.out.println("Day of the week : Monday");
				break;
			
			case 2:System.out.println("Day of the week : Thusday");
				break;

			case 3:System.out.println("Day of the week : Wednesday");
				break;

			case 4:System.out.println("Day of the week : Thursday");
				break;
	
			case 5:System.out.println("Day of the week : Friday");
				break;

			case 6:System.out.println("Day of the week : Saturday");
				break;

			case 7:System.out.println("Day of the week : Sunday");
				break;
			
			default:System.out.println("Invalid Day");
		}

		System.out.println("Good Bye!");
	}
}