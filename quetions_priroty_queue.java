package collection_priyanka_mam;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class quetions_priroty_queue {
	public static void main(String[] args) {
		
		
		//#queue programs
		PriorityQueue pp=new PriorityQueue<>();
		pp.add(10);
		pp.add(20);
		pp.add(30);
		pp.add(40);
		
		
		//1. remove all the elements from a priority queue.
		//pp.clear();
		System.out.println(pp);
		
		
		//2. Write a program to count the number of elements in a priority queue.
		System.out.println("size of PriorityQueue : "+pp.size());
		
		
		
		//3.retrieve the first element of the priority queue.
		System.out.println("first ele of PriorityQueue : "+pp.peek());
		
		
		
		//4. Write a program to convert a priority queue to an array containing all of the elements of the queue.
		 PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
	        
	        // Add elements to the PriorityQueue
	        priorityQueue.add(10);
	        priorityQueue.add(20);
	        priorityQueue.add(30);
	        priorityQueue.add(40);
	        
	        // Convert PriorityQueue to ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>(priorityQueue);
	        
	        // Display the ArrayList
	        System.out.println("ArrayList containing all elements of the PriorityQueue: " + arrayList);
	        
	        
		//5. Write a program to insert a given element into a priority queue.
		System.out.println();
		pp.offer(8);
		System.out.println("offer ele with PriorityQueue: "+pp);
		
		
		
		//6. Write a program to create a new priority queue and print out the elements of the priority queue
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(2);
		System.out.println(pq);
	}
}
