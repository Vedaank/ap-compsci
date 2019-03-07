// Mike B 9/25/09
// write the classes and methods that will make this compile without errors

import java.util.*;
import java.awt.*;

public static void main(String[] args)
{
	Gloop x = new Gloop();
	x.setValue(12);
	int y = x.getValue();
	x.doGlooping("I love APCS!", "Mr. B Rules!");
	double z = x.gloopify();
	
	Blim a = new Blim();
	Blim b = new Blim(x, 12, 3.14);
	a.setValue(12);
	b.setValue(a);
	Blim c = a.addBlim(b);
	String d = c.toString();
}