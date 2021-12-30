package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Mohit");
		list.add("Nilesh");
		list.add("Narayan");
		for (String S : list) {
			System.out.println(S);
		}

		System.out.println("************************");

		list = new LinkedList<>();

		list.add("Mohit");
		list.add("Nilesh");
		list.add("Narayan");
		for (String S : list) {
			System.out.println(S);
		}

		System.out.println("************************");

		list = new Vector<>();

		list.add("Mohit");
		list.add("Nilesh");
		list.add("Narayan");
		for (String S : list) {
			System.out.println(S);
		}

		System.out.println("************************");

	}

}
