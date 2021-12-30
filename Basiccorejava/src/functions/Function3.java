package functions;

public class Function3 {
	public static void main(String[] args) {

		eligibility(38, 87);

		// eligibility(38, 35);

		boolean ret = eligibility(38, 87);
		if (ret) {
			System.out.println("You are eligible");
			

		} else {
			System.out.println("You are not  eligible");


			
		}

		int a = sum(10, 20);
		System.out.println(a);

		int b = sum(30, 40);
		System.out.println(b);

		int c = sum(a, b);
		System.out.println(c);

	}

	public static boolean eligibility(int IIT, int cet) {

		if (IIT >= 40 || cet >= 50) {
			return true;

				} else {
					return false;

					}

	}

	public static int sum(int a, int b) {

		return a + b;

	}

}
