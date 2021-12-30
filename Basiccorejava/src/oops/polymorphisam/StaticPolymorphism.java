package oops.polymorphisam;

public class StaticPolymorphism {
	//function overloading=Static polymorphisam

	public static void main(String[] args) {
		
		StaticPolymorphism obj=new StaticPolymorphism();
		obj.sum(10,20);
		obj.sum(50,60,70 );

	}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

}
