package Test;
    // methodoverloading with sequnce of arguments
public class MethodOverloading2 {
	void show(int c, String s) {
		System.out.println(" this is the first method");
	}
	void show (String c, int s) {
		System.out.println("This is the second method");
	}
	public static void main(String[] args) {
		 MethodOverloading2 t= new  MethodOverloading2();
		 t.show("Nilesh",18);
		 t.show(18,"Nilesh");
	}

}
