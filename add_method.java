package collection_priyanka_mam;

import java.util.PriorityQueue;

public class add_method {

	public static void main(String[] args) {

		//here we maked the object of PriorityQueue class
		PriorityQueue <Integer> p1=new PriorityQueue<Integer>();
		p1.add(17);
		p1.add(98);
		p1.add(102);
		p1.add(1760);
		p1.add(12);
		p1.add(1);
		p1.add(3);
		p1.add(0);
		p1.add(11);
		p1.add(10);
		//same working as per add method particully use with append keyword
		//p1.offer(33);
		System.out.println(p1);

	}
}
