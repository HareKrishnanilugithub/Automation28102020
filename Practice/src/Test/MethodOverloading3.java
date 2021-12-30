package Test;
  // methodoverloading with arguments
public class MethodOverloading3 {
	void show(int a) {
		System.out.println("this is the int method");
	}
	void show(String s) {
		System.out.println(" this is the string method");
	}

	public static void main(String[] args) {
		 MethodOverloading3  n= new  MethodOverloading3 ();
		 n.show("Nilesh");
		 n.show(11);
	}
}
