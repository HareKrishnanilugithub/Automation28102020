package Test;

class Tech {
	void showB() {
		System.out.println("its my institue");
	}
}

class Krishna extends Tech {

	void ShowC() {
		System.out.println(" I LOVE MY LORD ");
	}
}
public class Skadam extends Krishna {
	void showA() {
		System.out.println("its my pgm");
	}


	public static void main(String[] args) {
		Skadam k = new Skadam();
		k.showA();
		k.showB();
		k.ShowC();

	}
}

