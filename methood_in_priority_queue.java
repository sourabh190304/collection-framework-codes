package collection_priyanka_mam;

import java.util.PriorityQueue;

public class methood_in_priority_queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1 =new PriorityQueue<Integer>();
		p1.add(1);
		p1.add(2);
		p1.add(3);
		System.out.println(p1);
		//to calculate size
		System.out.println(p1.size());
		//to clear queue
		//p1.clear();
		//use to check queue is empty or not //op in true or false
		System.out.println(p1.isEmpty());
		// to check and gave op the top element in queue
		//work when queue is empty
		// o/p null
		System.out.println("peek = "+p1.peek());
		// to check and gave op the top element in queue
		//not work when queue is empty
		//nosuchelementexception
		System.out.println("top = "+p1.element());
		//to check first element add remove that
		//work when queue is empty
		// o/p null
		System.out.println("poll = "+p1.poll());
		System.out.println(p1);
		//to check first element add remove that
		//not work when queue is empty
		//nosuchelementexception
		System.out.println("remove = "+p1.remove());
		System.out.println(p1);
		//to remove particular element
		p1.remove(3);
		//to check particular element is exist or not
		System.out.println(p1.contains(3));
		PriorityQueue<Integer> p2 =new PriorityQueue<Integer>();
		p2.addAll(p1);
		// to check to queue is equal or not 
		
		System.out.println(p2.equals(p1));
	}
}
