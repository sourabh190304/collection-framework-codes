package collection_priyanka_mam;

import java.util.HashSet;

public class hashset_methods {
	public static void main(String[] args) {
		HashSet<Integer>h1 =new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println(h1);

		HashSet h2 =new HashSet<>();
		h2.add(10);
		h2.add(20);
		System.out.println(h2);

		h1.retainAll(h2);
		System.out.println(h1);

	}
}
