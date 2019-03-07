Test 2 answers
1a. x, y, z, raisinBran, x
 b. x, y, z, a
 c. raisinBran, number
 d. Myst, Rectangle, Integer, CerealBox, Zebra
 e. mystery() in Myst, Zebra() in Zebra, change() in Rectangle, decimal() in Integer, getNum() in Myst

2. APCS is my favorite class Debugging is fun Yes APCS is the best

3. the range of code in which a variable or method exists

4.
public class Teacher
{
	private String name;
	private String subject;
	private double smartness;
	private int badJokes;

	public Teacher(String name, String subject, double smartness, int badJokes)
	{
		this.name = name;
		this.subject = subject;
		this.smartness = smartness;
		this.badJokes = badJokes;
	}

	public String toString()
	{
		return name + " teaches " + subject;
	}

	public double getSmartness()
	{
		return smartness;
	}

	public String getName()
	{
		return name;
	}
}

5.
// pre: num >= 0
// post: returns the positive square root of num
public static double sqrt(double num)

6. doStuff is supposed to return an int and there is no return statement
   doMore attempts to print out y, but y only exists inside doStuff

7.

public class Roozle
{
	public Roozle(String nonsense)
	{
	}
	
	public Roozle getRoozler()
	{
		Roozle answer = new Roozle("silliness");
		return answer;
	}
	
	public Kerplunk kerplunkify(Roozle anyNameWillDo)
	{
		Kerplunk answer = new Kerplunk();
		return answer;
	}
}

public class Kerplunk
{
	public Kerplunk()
	{
	}
	
	public String toString()
	{
		return "I love to kerplunk!";
	}
	
	public void roozle(int whateverNameIwant)
	{
	}
}

8.
public Fraction multiply(Fraction other)
{
	Fraction answer = new Fraction();
	answer.num = this.num * other.num;
	answer.denom = this.denom * other.denom;
	return answer;
}