package collection_framework_hrishi_sir;

import java.util.ArrayList;

public class ex_arraylist {
	public static void main(String[] args) {
		
		ArrayList bank_th = new ArrayList();
		
		bank_th.add("current bal ;");
		bank_th.add(500000.50);
		bank_th.add("debited amount :");
		bank_th.add(100000);
		bank_th.add("current bal ;");
		bank_th.add(400000.50);
		
		System.out.println(bank_th);
		
		
		//using genericous
		ArrayList<Float> bank_th2 = new ArrayList();
		
		bank_th2.add(0.99f);
		bank_th2.add(1.0f);
		
		System.out.println(bank_th2);
		
		//collection hiearchii;
		
		
		
		

		
	}

}
