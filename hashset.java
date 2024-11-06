package collection_priyanka_mam;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {

		//hashset created with hashset class object
		HashSet h1=new HashSet<>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println(h1);

		//clone hashset or duplicate hashset using the clone method 
		HashSet<Integer> h2=new HashSet<Integer>();
		h2=(HashSet<Integer>)h1.clone();
		System.out.println(h2);
		
		//to clear hashset 
		h2.clear();
		System.out.println(h2);
		
		//to check hashset is empty
		System.out.println(h2.isEmpty());
		
		//to check size of hashset 
		System.out.println(h1.size());

		//to check contaoins elememt in hashset 
		System.out.println(h1.contains(10));
		
		//add all elements in h1 using addall method 
		h2.addAll(h1);
		System.out.println(h2);
		}
}
