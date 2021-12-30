package Test;    /// SINGLE INHERITANCE PGM

class abc {
	void showA() {
		System.out.println("a is method");
	}
}
public class Bca extends abc {

	void showB() {
		System.out.println(" b is a method");
	}

	public static void main(String[] args) {
		Bca v = new Bca();
		v.showA();
		v.showB();

	}

}

