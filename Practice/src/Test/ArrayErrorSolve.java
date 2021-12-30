package Test;

public class ArrayErrorSolve {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}System.out.println();
			System.out.println("----------------");
			
		}
		
		int [][] b={{45,12},{78,52},{89,56}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+",");
			}//System.out.println();
		}
		

	}

}
