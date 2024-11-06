package collection_priyanka_mam;

import java.util.HashSet;

public class que_hashset {
	public static void main(String[] args) {
		//#hashset assignments
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		//1.HashSet Is Empty Or Not
		System.out.println(h1.isEmpty());
		
		//2.Write a program to add all the elements of a specified hash set to another hash set
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.addAll(h1);
		System.out.println(h2);
		
		//3. Write a program to compare two hash set
		System.out.println(h1.equals(h2));
		
		//4. Append The Specified Element To The End To HashSet
		h2.add(40);
		System.out.println(h2);
		
		//5.Write a program to compare two sets and retain elements which are same on both sets.
		h1.retainAll(h2);
		System.out.println(h1);
		
		//6.Write a program to remove all of the elements from a hash set.
		h1.clear();
		System.out.println(h1);
		
		//7.Write a program to get the number of elements in a hash set.
		System.out.println(h2.size());
	}
}
