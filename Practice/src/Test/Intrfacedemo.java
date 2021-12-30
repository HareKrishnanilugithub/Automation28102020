package Test;

interface I1 {
	void show();

}

class Npatil implements I1 {
	public void show() {
		System.out.println(" 1");
	}
}

public class Intrfacedemo {
	public static void main(String[] args) {
		
	
		 Npatil t= new  Npatil();
	       t.show();
	

}
}
