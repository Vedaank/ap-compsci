// Mike B 9/25/09
// write the classes and methods that will make this compile without errors

import java.util.*;
import java.awt.*;
public class ClassReviewDriver
{
	public static void main(String[] args)
	{
		Gloop glindle = new Gloop();
		glindle.gouza(12);
		int itza = glindle.grek();
		Gronk gurgle = new Gronk('A', itza);
		boolean bwana = gurgle.groove();
		glindle.doGlooping("I love APCS!", "Mr. B Rules!");
		double drackzoom = glindle.gloopify();
		 
		Blim brimey = new Blim();
		Blim bfunk = new Blim(glindle, 12, 3.14);
		brimey.bowkle(12);
		bfunk.bowkle(brimey);
		Blim bwop = brimey.blimBlam(bfunk);
		glindle = bwop.gloopify();
		System.out.println("It all works!");
	}
}	