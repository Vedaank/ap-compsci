// Mike B 9/25/13
// write the classes and methods that will make this compile without errors
// ONE LINE CANNOT be compiled.  Comment it out.

import java.util.*;
import java.awt.*;
public class ClassReviewDriver
{

	public static void main(String[] args)
	{
		Gloop x = new Gloop();
		x.setValue(12);
		int y = x.getValue();
		Blim a = new Blim(Color.blue);
		double z = x.gloopify();
		Blim b = new Blim(x, "12", 3.14);
		a.setValue(12);
		Blim c = x.blimify(7);
		y.setValue(12);
		x.doGlooping("I love APCS!", "Mr. B Rules!");
		b.setValue(a);
		a.bloom(x.getValue());
		c = a.addBlim(b);
		z = Math.sqrt(c.getValue());
		String d = c.toString();
		System.out.println(d);		// should print out "This is the most fun I have ever had!"
		System.out.println(x);		// should print out, "really, most fun ever!"	
	}
}