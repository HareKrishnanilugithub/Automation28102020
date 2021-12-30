
package Test;

public class TwoDimentinalArray {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 40, 50, 60 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " "); // matrix array
			}
		}
		{
			int[][] b = { { 80, 90, 100 }, { 110, 120, }, { 130, 140, 150, 160 } };
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println(); // jagged array
			}
		}

	}
}
