package collection_framework_hrishi_sir;

import java.util.Iterator;
import java.util.LinkedList;

public class intre_toe {
	public static void main(String[] args) {
		LinkedList ll1 =new LinkedList<>();

		ll1.add(40);
		ll1.add(30);
		ll1.add(20);
		ll1.add(10);
		
		System.out.println(ll1);

		Iterator i=ll1.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());

		}
		System.out.println();
		Iterator j=ll1.descendingIterator();

		while(j.hasNext()){
			System.out.println(j.next());
		}
		
		System.out.println();
		
		//peek method to found element without removing 
			System.out.println(ll1.peek());
			System.out.println(ll1.peekFirst());
			System.out.println(ll1.peekLast());
		
	}
}

