package Test;

public class This1 {
	int i;

	void setvalue(int x) {
		this.i = x;
	}

	void show() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		This1 n = new This1();
		n.setvalue(11);
		n.show();
	}
}
