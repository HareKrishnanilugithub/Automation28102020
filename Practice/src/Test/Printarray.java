package Test;

public class Printarray {
	public static void main(String[] args) {
		
		int[] a= new int [3];
		a[0]=10;
		a[1]=20;
		a[2]=30; //its first way to initialise array.
		
		for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);
		
	}
		
		int[]b= {20,30,40} ;    //  its second way to initialise array
		
		for(int n:b) {                  // for each loop are used to print array
			System.out.print(n+",");
		}
				

}
}

