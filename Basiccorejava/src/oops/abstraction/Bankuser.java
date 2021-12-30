package oops.abstraction;

public class Bankuser  {

	public static void main(String args []) {
		
	
		
	
		
	

	public static void test1() {
		bank(new Hdfc());
		bank(new Kotak());
		bank(new Union());
	}

	public static void bank(RBI bank1) {

		bank1.savingAccount();
		bank1.currentAccount();
		bank1.creditCard();
		bank1.debitCard();

	}
}


/*
 * RBI bank1=new Kotak();
 * 
 * bank1.savingAccount(); bank1.currentAccount(); bank1.creditCard();
 * bank1.debitCard();
 * 
 * System.out.println("*****************************");
 * 
 * bank1=new Hdfc(); bank1.savingAccount(); bank1.currentAccount();
 * bank1.creditCard(); bank1.debitCard();
 * 
 * System.out.println("*****************************"); bank1=new Union();
 * 
 * bank1=new Hdfc(); bank1.savingAccount(); bank1.currentAccount();
 * bank1.creditCard(); bank1.debitCard();
 * 
 * // System.out.println("*****************************");
 */
