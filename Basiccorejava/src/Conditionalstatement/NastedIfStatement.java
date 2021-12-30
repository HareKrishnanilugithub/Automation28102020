package Conditionalstatement;

public class NastedIfStatement {
	public static void main(String[] args) {
		//test case 1
		 //launch browser - failed
	       //navigate
	       //verify google logo
		boolean step1=false;
		boolean step2=false;
		boolean  step3=false;
		if(step1)
		{
		System.out.println("step 1 is passed");

		if(step2)
		{
		System.out.println("step 2 is passed");
		          
		if(step3)
		{
		System.out.println("step 3 is passed");
		}else {
		System.out.println("step 3 is failed");
		}

		}else {
		System.out.println("step 2 is failed");
		}
		}else {
		System.out.println("step 1 is failed");

		}

		
	}
}
		
		
		