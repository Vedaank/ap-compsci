import java.util.*;

class FunMain
{
	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in);
		int input, input2, answer = 0;
	//	Fun a = new Fun();
		
		input = 0;				/********* LCM ******************/
		while (input != -1)
		{
			System.out.println("Enter two numbers to find the LCM for, -1 -1 to quit");
			input = keys.nextInt();
			input2 = keys.nextInt();
			if (input != -1)
			{
	//			answer = a.findLCM(input, input2);
				System.out.print("The LCM of " + input + " and " + input2);
				System.out.println(" is " + answer);
			}
		}		
		
		input = 0;				/********* reverse ******************/
		while (input != -1)
		{
			System.out.println("Enter a number to reverse, -1 to quit");
			input = keys.nextInt();
			if (input != -1)
			{
	//			answer = a.reverse(input);
				System.out.println(answer);
			}
		}
		
		input = 0;				/********* findMagic ******************/
		while (input != -1)
		{
			System.out.println("How many magic squares do you want to find?");
			input = keys.nextInt();
	//		if (input != -1)
	//			a.findMagic(input);
		}		
	}
}
