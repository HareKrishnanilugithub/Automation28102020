package Test;

public class Employee {
	String Name;
	int Empid;
	
	Employee(String Name, int Empid){   // parametrised constructor created 
		this.Name=Name;
		this.Empid=Empid;
	}
	public static void main(String[] args) {
		Employee e1= new Employee("deepak",101);   // parametrised constructor calling 
		Employee e2= new Employee("Nilesh",103);   // parametrised constructor calling
		System.out.println("Employee e1 :"  +e1.Name+  " "+e1.Empid);
		System.out.println("Employee e2 :" +e2.Name+  " "+e2.Empid);
	}
}
