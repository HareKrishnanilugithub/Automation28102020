package oops.encaptulation;

public class Userdetails {
	private int age;
	private String name;

	public int getAge() {
		if (age == 0) {
			System.out.println(" age is a 0");
		}

		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
}
