package Test;   // methodoverriding sequence of argumets are same

class nilu {
	void show(int a ) {
		System.out.println(" this is the string and int method");
	}

}


class swapnali extends nilu {
	void show(int a, String s) {
		System.out.println(" SWAPNALI IS THE BEST FRIEND OF NILU");
	}
}

public class MethodOverriding3 extends swapnali {
	void show(String a, int s) {
		System.out.println(" Swapnali and Nilesh are the best friends in the world");

	}
	public static void main(String[] args) {
		nilu n= new nilu();
		n.show(18);
		swapnali s= new swapnali();
		s.show(12,"friends");
		 MethodOverriding3 m=new  MethodOverriding3();
		 m.show("friends" ,12 );
	}
}
