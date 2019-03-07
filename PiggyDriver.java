// Mike Bollhorst
// Piggy Bank Driver
// Sept 17, 2013

public class PiggyDriver
{
	public static void main(String[] args)
	{
		// creates an empty piggybank for son
		PiggyBank son = new PiggyBank();
		// creates a piggybank with 7 pennies, 3 nickels, 20 dimes, 14 quarters
		PiggyBank daughter = new PiggyBank(7, 3, 20, 14);

		son.addPennies(18);
		daughter.addQuarters(4);
		daughter.addPile(3, 2, 1, 0);	// adds 3 pennies, 2 nickels, 1 dime, 0 quarters

		int sonValue = son.getValue();
		int daughterValue = daughter.getValue();

		System.out.println("Son has " + sonValue + " cents and daughter has " + daughterValue + " cents");

		int numQuarters = daughter.getQuarters();
		System.out.println("Daughter has " + numQuarters + " quarters");

		daughter.spend(3.87);		// daughter withdraws $3.87
		
		System.out.println("After spending 3.87 daughter now has " + daughter.getValue() + " cents left");
		System.out.println("Daughter has " + daughter.getPennies() + " pennies");
		System.out.println("Daughter has " + daughter.getNickels() + " nickels");
		System.out.println("Daughter has " + daughter.getDimes() + " dimes");
		System.out.println("Daughter has " + daughter.getQuarters() + " quarters");

		son.spend(sonValue / 100.0);
		System.out.println("After emptying his bank, son now has " + son.getValue() + " left");
	}
}
/*--------------------Configuration: Piggy - JDK version 1.6.0_20 <Default> - <Default>--------------------
Son has 18 cents and daughter has 695 cents
Daughter has 18 quarters
After spending 3.87 daughter now has 308 cents left
Daughter has 8 pennies
Daughter has 5 nickels
Daughter has 20 dimes
Daughter has 3 quarters
After emptying his bank, son now has 0 left

Process completed.*/