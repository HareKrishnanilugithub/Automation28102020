package Test;

class test {                     // method overriding the number of arguments are same.
	void show() {
		System.out.println(" this is the methods a");
	}
}

class xyz extends test {
	void show() {
		System.out.println(" this is the method b");
	}
}

public class MethodOverriding1 {
	void show() {
		System.out.println(" this is overriding");
	}

	public static void main(String[] args) {
		// test t= new test ();
		// t.show();
		xyz x = new xyz();
		x.show();
		test t = new test();
		t.show();
		MethodOverriding1 m = new MethodOverriding1();
          m.show();
	}

}
