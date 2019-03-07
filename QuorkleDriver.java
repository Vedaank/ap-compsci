// Mike Bollhorst
// Quorkle Driver - write the Quorkle class to make this compile

public class QuorkleDriver
{
	public static void main(String[] args)
	{
		Quorkle pretty = new Quorkle();
		Quorkle prettier = new Quorkle(2);
		
		int abc = pretty.getQuork();
		String def = prettier.getSparkle();
		
		pretty.setSparkle("blue and green", 7.0);		// words in quotation marks are String objects
		prettier.setQuork(12);
		
		prettier = pretty.getQ();
	}
}