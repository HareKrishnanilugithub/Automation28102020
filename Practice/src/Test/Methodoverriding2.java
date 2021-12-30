package Test; // method overriding type of arguments are same

class cba {
	void show(String a) {
		System.out.println(" this is the string method");
	}
}

 public class Methodoverriding2  extends cba {
	void show(String a) {
		System.out.println(" this the string  method ");
	}

	public static void main(String[] args) {
		 Methodoverriding2 b = new  Methodoverriding2();
		b.show("Swapnali");
		b.show("nilu");

	}
}

//public class Methodoverriding2 {

//}
