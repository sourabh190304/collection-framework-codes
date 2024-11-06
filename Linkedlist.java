package collection_framework_hrishi_sir;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
	public static void main(String[] args) {

		System.out.println("enter the elements in linkedList: ");
		//assigning literals using scanner
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int k=sc.nextInt();

		int p,q,r;
		p=sc.nextInt();
		q=sc.nextInt();
		r=sc.nextInt();
		//created object of linkedlist 
		LinkedList ll = new LinkedList();
		// add method use to add element in linkedlist
		ll.add(s);
		ll.add(p);
		ll.add(r);
		ll.add(q);
		ll.offer(k);

		System.out.println("before sort : ");
		System.out.println(ll);

		//sorting using collection method 
		Collections.sort(ll);

		System.out.println("after sort : ");
		System.out.println(ll);



	}
}
