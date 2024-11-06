package collection_priyanka_mam;
public class re_curssion_methood {

	static void print(int num){//10 
		if(num==0) {
			return;
		}
		System.out.println(num);//10
		print(num-1);//9
	}
	
//	static void print(int num)9 {
//		if(num==0)false {
//			return;
//		}
//		System.out.println(num)9;
//		print(num-1)8;
//	}


// num-- upto (num==0) condition not satisfied

//static void print(int num)0 {
//if(num==0) {
//	return;
//}

//when condition gets satisfied it will stop at a return only and 
//not even execute single line afer that 
	
//System.out.println(num);
//print(num-1);
//}

	public static void main(String[] args) {
		int num =10;
		print(num);
	}
}
