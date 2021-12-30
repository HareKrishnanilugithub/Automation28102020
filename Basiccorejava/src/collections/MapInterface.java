package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "Nilesh");
		map.put(4, "Narayan");
		map.put(1, "Nayan");
		map.put(3, "Nishant");
		map.put(2, "Nikhil");

		System.out.println(map.get(2));
		System.out.println("******************************");

		Set<Integer> keys = map.keySet();
		for (int key : keys) {
			System.out.println(map.get(key));

		}
	}

}
