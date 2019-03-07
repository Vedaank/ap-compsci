 
public class ArrayDriver 
{
	public static void main(String [] args)
	{
		Arrays a = new Arrays();
		final int MAX = 20;
		int[] list = new int[MAX];
		a.fillWithRandoms(list);
		System.out.println("the list is ");
		a.print(list);
		int numberOfSevens = a.countSevens(list);
		System.out.println("there are " + numberOfSevens + " in the list");
		a.reverse(list);
		System.out.println("the reversed list is ");
		a.print(list);
	}  
}