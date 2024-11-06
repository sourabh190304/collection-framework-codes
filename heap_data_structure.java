package collection_priyanka_mam;

import java.util.PriorityQueue;
public class heap_data_structure {

	public static void main(String[] args) {

		//here we maked the object of PriorityQueue class
		PriorityQueue <String> p1=new PriorityQueue<String>();
		p1.add("csk");
		p1.add("mi");
		p1.add("dc");
		p1.add("kkr");
		p1.add("rcb");
		//same working as per add method particully use with append keyword
		//p1.offer(33);
		System.out.println(p1);
		
		PriorityQueue <Float> p2=new PriorityQueue<Float>();
		p2.add(2.2f);
		p2.add(1.2f);
		p2.add(4.5f);
		p2.add(3.6f);
		p2.add(5.2f);
		//same working as per add method particully use with append keyword
		//p1.offer(33);
		System.out.println(p2);

	}
}

