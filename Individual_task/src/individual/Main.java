package individual;

import java.util.Scanner;

public class Main
{
	public static void main() 
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Write number:");
		int number = console.nextInt();
		console.close();
		counter.count(number);
		
		
	}

}
