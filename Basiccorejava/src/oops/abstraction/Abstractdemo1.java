package oops.abstraction;

//import Test.Bike;
//import Test.Honda;

abstract  class Bike {


abstract void run();

}

class Honda extends Bike {
	void run() {
		System.out.println(" honda bike is running");
	}
}

public class Abstractdemo1 {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();

	}

}

