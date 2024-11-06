package collection_framework_hrishi_sir;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class diff_btwn_2interface_clasess {
	public static void main(String[] args) {
		//arraylist follows insertion order
		//arraylist allows repeatation
		//arraylist allows multiple null values
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(null);
		a1.add(null);
		
		System.out.println("arraylist : "+a1);

		//hashset doesnt follows insertion order
		//hashset doesnt follows repaeatation
		//hashset allows single null values 
		HashSet h1=new HashSet<>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(null);
		System.out.println("hashset : "+h1);
		
		//LinkedHashSet follows the insertion order
		//LinkedHashSet doesnt follows repaeatation
		LinkedHashSet lh1=new LinkedHashSet();
		lh1.add(10);
		lh1.add(20);
		lh1.add(30);
		//assign duplicate ele but not displayed
		lh1.add(10);
		lh1.add(20);
		lh1.add(30);
		System.out.println("Linkedhashset : "+lh1);
		
		//tree set store and print / display datain asce order by deafult
		//tree set doesnt allows the treeset
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		System.out.println("treeset : "+t1);

		
		
	}
}
