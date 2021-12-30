package Test;
  // method overloading with number of arguments
public class MethodOverloading1 {
	void show (int a,int b) {
		 System.out.println(" this is the first show method"); 
		
	}
	void show(int b) {
		System.out.println(" this is second show mwthod");
	}
	public static void main(String[] args) {
		 MethodOverloading1 m=  new  MethodOverloading1();
		 m.show(13);
		 m.show(11, 12);
	}

}
