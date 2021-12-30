package functions;

public class Script {

	public static void main(String[] args) {
		Library.sum(10,20);
		Library.print();
		Library ref=new Library();
		ref.fun1();
		
		String data=ref.printName("Nilesh");
		System.out.println(data);
		
		
		Accessmodifires ref2=new Accessmodifires();
		ref2.publicFunction();
		ref2.noAcessModifiers();
		ref2.protectFunction();

	}

}
