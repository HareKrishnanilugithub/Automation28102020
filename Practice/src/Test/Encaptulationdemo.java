package Test;

class Empolyee {
	private int empid; // data encpatulation means data hidden

	public void setEmpid(int eid) {
		empid = eid;
		System.out.println(" this is your empid");
	}

	public int getEmpid() {
		return empid;
	}
}

public class Encaptulationdemo {
	
	public static void main(String[] args) {
		Empolyee e= new Empolyee();
		e.setEmpid(12);
		System.out.println(e.getEmpid());
	}

}
