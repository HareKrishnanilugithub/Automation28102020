package oops.polymorphisam;


import oops.inheritence.*;

public class DynamicPolymorphisam {
	
	
	// you can use refernce of your parent class for the object of your child class
    //in this secenerio you can call only those functions which are present in your parent class.
	//in this secenerio your overidden method will get call from your child class
	
	public static void main(String[] args) {
		
    Telephone Mobile=new mobile();
    Mobile.calling();
   // Mobile.texting();
	}

}
