package Test;

class Pilu {
	void showA() {
		System.out.println(" a class method called");

	}
}

class bala extends Pilu {
	void showB() {
		System.out.println(" b class method called ");
	}
}

class kala extends Pilu {
	void showC() {
		System.out.println(" c class method  called");
	}
}

public class HirarchicalTest extends Pilu {
	void showD() {
		System.out.println(" D class method called");
	}

	public static void main(String[] args) {
		 Pilu	 ob1 = new  Pilu ();
		ob1.showA();
		System.out.println("--------------");
		bala ob2 = new bala();
		ob2.showA();
		ob2.showB();
		System.out.println("--------------------");
		kala ob3 = new kala();
		ob3.showA();
		ob3.showC();
        System.out.println("-------------");
        HirarchicalTest ob4= new  HirarchicalTest();
        ob4.showA();
        ob4.showD();
	}
}
