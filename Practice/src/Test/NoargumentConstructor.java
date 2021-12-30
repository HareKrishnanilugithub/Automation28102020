package Test;

public class NoargumentConstructor {
	
	String s;
	int i;
	
	 NoargumentConstructor()    // no argument constructor or user defined constructor
	 {
		 System.out.println("no argument constructor");
	 }
	 public static void main(String[] args) {
		 NoargumentConstructor n=new  NoargumentConstructor(); // no argument constructor called
	}
}
