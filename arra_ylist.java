package collection_framework_hrishi_sir;

import java.util.ArrayList;
import java.util.LinkedList;

public class arra_ylist {
	public static void main(String[] args) {
		ArrayList al1 =new ArrayList<>();

		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);

		System.out.println("al1 : "+al1);
		
		//copied fst arraylist to secod arraylist 
		ArrayList al2 =new ArrayList<>(al1);

		System.out.println("al2 : "+al2);
		
		//likedlist to arraylist coversion 
		
		LinkedList ll1 =new LinkedList<>();

		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);

		System.out.println("LinkedList : "+ll1);
		
		//copied fst linked list to secod arraylist 
		ArrayList al3 =new ArrayList(ll1);

		System.out.println("ArrayList : "+al3);
	}
}
