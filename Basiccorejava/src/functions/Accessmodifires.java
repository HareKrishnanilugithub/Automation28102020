package functions;

public class Accessmodifires {

	public static void main(String[] args) {
		
		Accessmodifires obj=new Accessmodifires();
		obj.privateFunction();
        obj.publicFunction();
        obj.protectFunction();
        obj.noAcessModifiers();

	}
	public void publicFunction() {
		System.out.println("Public Function");
	}
	private void privateFunction() {
		System.out.println("Private Function");
	}
	void noAcessModifiers() {
		System.out.println("No access Modifires");
	}
	
	//protected members can be accessed through out the project using child class.
	protected void protectFunction()
	{
		System.out.println("Protected Function");
	}

}
