package Test;

//MULTILEVEL INHERITENCE

class A {
	void display() {
		System.out.println("Display function call");
	}
}

class B extends A {
	void show1() {
		System.out.println(" show1 function call");
	}
}

class C extends B {
	void show2() {
		System.out.println("show2 function called");
	}

}

public class MultilevelTest extends C {

	void show4() {
		System.out.println("show4 function called");
	}

	public static void main(String[] args) {
		MultilevelTest m = new MultilevelTest();
		m.display();
		m.show1();
		m.show2();
		m.show4();
	}

}
