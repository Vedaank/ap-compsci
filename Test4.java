public class ArrayStuff
{
	public int[] fillArray(int length)
	{
		int[] list = new int[length];
		for (int i = 0; i < length; i++)
			list[i] = (int)(Math.random() * 10 + 1);
		return list;
	}
	
	public int find(int[] list, int value)
	{
		int i = 0;
		while (i < list.length && list[i] != value)
			i++;
		if (i == list.length)
			return -1;
		else
			return i;		
	}
	
	public int count(int[] list, int value)
	{
		int count = 0;
		for (int i = 0; i < list.length; i++)
			if (list[i] == value)
				count++;
		return count;
	}
	
	public void remove(int[] list, int value)
	{
		int spot = find(list, value);
		if (spot != -1)
		{
			for (int i = spot + 1; i < list.length; i++)
				list[i - 1] = list[i];
			list[list.length - 1] = 0;	
		}
	}
}

public String toString()
{
	return "Teacher: " + name + ", Subject: " + subject;
}

public class APCSTeacher extends Teacher
{
	private double brilliance;
	
	public APCSTeacher (String name, double brilliance)
	{
		super(name, "APCS");
		this.brilliance = brilliance;
	}
	
	public String getName()
	{
		return "totally cool " + super.getName();
	}
	
	public double isSmarter(APCSTeacher other)
	{
		return this.brilliance / other.brilliance;
	}
}

totally cool Mr. Bollhorst
Mr. Jordan
Teacher: Mr. Bollhorst, Subject: APCS
Teacher: Mr. Jordan, Subject: Math

B
E
E
C