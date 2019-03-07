public class KlonkDriver
{
	public static void main(String[] args)
	{
		Klonk k = new Klonk("Hello klonkmeister");
		k.kerfuffle(12);
		int z = k.kerplunk();
		Palooza p = new Palooza(k);
		k = p.kerfuffle(2.2);
	}
}