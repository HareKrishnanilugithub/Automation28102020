package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Nilesh");
		set.add("Nilesh");
		set.add("Narayan");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("****************************");

		set = new LinkedHashSet<>(); // preserves the insertion order
		set.add("Nilesh");
		set.add("Nilesh");
		set.add("Narayan");
		set.add("Amit");
		set.add("Ashish");
		set.add("Rozina");
		set.add("Kanchan");

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("****************************");

		set = new TreeSet<>(); // Default sorted
		set.add("Nilesh");
		set.add("Nilesh");
		set.add("Narayan");
		set.add("Amit");
		set.add("Ashish");
		set.add("Rozina");
		set.add("Kanchan");

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("****************************");

	}

}
