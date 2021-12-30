package Test;

public class Testveriables {
	int a = 10; // instance veriable declare
	static int b = 20; // static veriable declare

	public static void main(String[] args) {

		Testveriables a1 = new Testveriables(); // object creation
		System.out.println(a1.a);
		System.out.println(a1.b);

		a1.a = 1000;   // local veriable
		a1.b = 2000;   // local veriable
		System.out.println(a1.a);
		System.out.println(a1.b);

		Testveriables b1 = new Testveriables();
		System.out.println(b1.a);
		System.out.println(b1.b);

	}

}
