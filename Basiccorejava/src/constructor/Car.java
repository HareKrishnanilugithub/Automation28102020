package constructor;

public class Car {

	// Non static veriable difined as class level known as instance veriable.

	String colour;
	String model;
	int engine;

	// default value of Stinge verialbe will always be null.
	// for integer its 0.

	// Static veriable defined at a class level known as class veriable.
	static int wheels;

	public void feature() {
		// Veriable defined in a function known as local veriable.
		int a = 10;

		System.out.println("Car features colour:" + colour + ",model:" + model + " and engine size:" + engine
				+ ", wheels=" + wheels);

	}

// Constructor initializes the object
//Defualt constructot

	public Car() {

	}

//paramtrised constructor
	public Car(String col, String mod, int eng) {
		colour = col;
		model = mod;
		engine = eng;
	}
}

// constructor  overloading : 2 or more different parametres