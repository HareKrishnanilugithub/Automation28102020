package Conditionalstatement;

public class Logicaloperator1OR {
	public static void main(String[] args) {
		//verify eligibility of user
		//pooja , pune univercity
		//IIT JEE and MHCET(IIT>40,MHCET>=60)
		//100-30  MHCET -60
		
		
		int IIT=10;
		int cet=10;
		if(IIT>=40||cet>=50) {
			System.out.println("YOU ARE ELIGIBAL");
		}else {
			System.out.println("YOU ARE NOT ELIGIBAL");
		}
		
	}

}
