package Test;

public class Example {
	Example() /// default constructor called
	{
		System.out.println("Default Constructor called");
	}
	/* paramterised constructor with two integer arguments */

	Example(int i, int j) {
		System.out.println("Constructor with two parameters");
	}

	/* Parametrised constructor with three integer arguments */
	Example(int a, int b, int c) {
		System.out.println("Constructor with three Parameters");
	}

	/* Parametrised constructor with two arguments int and satring */
	Example(int i, String name) {
		System.out.println("Constructor with int and String Parameters");
	}

	public static void main(String args[]) {
		// this will invoke default constructor
		Example obj = new Example();
		/* This will invoke constructor with two int parameters */
		Example obj2 = new Example(12, 12);
		/* this will invoke constructor with three int parameters */
		Example obj3 = new Example(11, 12, 13);
		/* this will invoke the parameters with int and string parameters */
		Example obj4 = new Example(1, "Nilesh");

	}
}
