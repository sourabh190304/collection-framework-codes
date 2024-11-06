package collection_priyanka_mam;

import java.util.PriorityQueue;

public class copying_queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1 =new PriorityQueue<Integer>();
		p1.add(1);
		p1.add(2);
		p1.add(3);
		System.out.println(p1);
		PriorityQueue<Integer> p2 =new PriorityQueue<Integer>(p1);
		//copied from direct object 
		System.out.println(p2);
		PriorityQueue<Integer> p3 =new PriorityQueue<Integer>();
		//copied using addAll function
		p3.addAll(p2);
		System.out.println(p3);

	}
}
