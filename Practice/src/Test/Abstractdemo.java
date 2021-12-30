package Test;

abstract  class Bike {


abstract void run();

}

class Honda extends Bike {
	void run() {
		System.out.println(" honda bike is running");
	}
}

public class Abstractdemo {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();

	}

}
