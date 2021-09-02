
public class BankTester 
{
	public static void main (String [] args)
	{
		bank b = new bank();
		b.deposit("Winfrey", 25159684372.43);
		b.deposit("Bezos", 193495330293.43);
		b.deposit("Bezos", 20394353.35);
		System.out.println(b.checkBalance("Bezos"));
		System.out.println(b.checkBalance("Winfrey"));
		System.out.println(b.checkBalance("YoMama"));
		System.out.println(b.checkBalance("MrTheiss"));
		b.withdraw("Bezos", 3593293.66);
		b.deposit("MrTheiss",64033.55);
		b.withdraw("MrTheiss", 443964.46);
		System.out.println(b.checkBalance("Bezos"));
		System.out.println(b.checkBalance("Winfrey"));
		System.out.println(b.checkBalance("YoMama"));
		System.out.println(b.checkBalance("MrTheiss"));
	}
	
}
