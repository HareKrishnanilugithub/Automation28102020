package oops.encaptulation;

//import Test.Empolyee;

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

public class Encaptulationdemo1 {
	
	public static void main(String[] args) {
		Empolyee e= new Empolyee();
		e.setEmpid(11);
		System.out.println(e.getEmpid());
		Userdetails user=new Userdetails();
		user.setAge(50);
		System.out.println(user.getAge());
	}

}

