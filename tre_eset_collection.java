package collection_priyanka_mam;

import java.util.TreeSet;

public class tre_eset_collection {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(45);
		t1.add(7);
		t1.add(18);
		t1.add(8);
		System.out.println(t1);
		//to check size
		System.out.println(t1.size());


		//to check is empty or not 
		if(t1.isEmpty()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

			// to cleat set
			//t1.clear();
			System.out.println(t1);

			//added two ele after clear t1
			t1.add(10);
			t1.add(20);

			//to clone or duplicate treeset 
			TreeSet<Integer> t2=new TreeSet<Integer>();
			t2=(TreeSet<Integer>)t1.clone();
			System.out.println(t2);
			
			
			//print t1
			System.out.println("before poll : "+t1);
			
			
			//to find first elemrnt 
			System.out.println(t1.first());
			
			
			//to find last elemrnt 
			System.out.println(t1.last());
			
			
			//to find first elemrnt and remove 
			System.out.println("poll = "+t1.pollFirst());
			
			
			//to find last elemrnt  and remove
			System.out.println("last poll = "+t1.pollLast());
			
			//print after poll methood 
			System.out.println("after poll : "+t1);
			
			//to find or check <= element in given treeset
			int ele=9;
			System.out.println(t1.ceiling(ele));
		}
	}
}
