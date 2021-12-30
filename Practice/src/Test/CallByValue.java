package Test;

public class CallByValue {
      static int sum(int a, int b) {
    	 return a+b;
     }
     public static void main(String[] args) {
		int x=6; int y = 8;
		int c=sum(x,y);                // call by value
		System.out.println("sum="+c);
		
		
	}
}
