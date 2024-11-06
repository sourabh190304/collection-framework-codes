package collection_priyanka_mam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class treeset_assignments {
	public static void main(String[] args) {
		//#TreeSet Assignments:--

		//	1.Write a program to convert a tree set to a hash set . and return treeSet.
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(45);
		t1.add(7);
		t1.add(18);
		t1.add(8);
		System.out.println(t1);

		HashSet<Integer> t4=new HashSet<Integer>();
		t4.addAll(t1);
		System.out.println(t4);

		//	3. Write a program to get the first and last elements in a tree set.
		System.out.println(t1.first());
		System.out.println(t1.last());
		
		
		//	4. Write a program to clone a tree set list to another tree set
		System.out.println("clone a tree set list to another tree set :");
		TreeSet<Integer> t3=new TreeSet<Integer>();
		t3.addAll(t1);
		System.out.println(t3);
		
		
		//	5. Write a program to get the number of elements in a tree set
		System.out.println("get the number of elements in a tree set :");
		System.out.println(t1.size());
		
		
		//	6. Write a program to get the element in a tree set which is greater than or equal to the given element.
		System.out.println("greater than or equal to the given element :");
		int ele=18;
		System.out.println(t1.ceiling(ele));
		
		
		//	7. Write a program to retrieve and remove the first element of a tree set
		System.out.println("remove the first element :");
		System.out.println(t1.pollFirst());
		
		
		//	8. Write a program to retrieve and remove the last element of a tree set
		System.out.println("remove the last element : ");
		System.out.println(t1.pollLast());
		
		
		//	9. Write a program to remove a given element from a tree set
		System.out.println("remove a given element :");
		System.out.println(t1.remove(7));
		System.out.println(t1);
		
		//	10.Write a program to convert a hash set to a arraylist.
		System.out.println("convert a hash set to a arraylist :");
		HashSet<Integer> t2=new HashSet<Integer>();
		t2.add(10);
		t2.add(20);
		
		ArrayList<Integer> a1=new ArrayList<Integer> ();
		a1.addAll(t2);
		System.out.println(a1);
		

	}
}
