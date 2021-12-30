package Test;

public class DefaultConstructor {
	int i=0;
	// test() compiler ne defult constructor call kela automatically .
	public static void main(String[] args) {
		
		 DefaultConstructor t=new  DefaultConstructor();
		 System.out.println(t.i);    // defult constructor called
		
	}

}



// jya veles apn ek class create karto ani tyacha object create krto main method maddhe tya veles compiler ek swataha ek constructor create krto tryala defult consturctor mhantat.