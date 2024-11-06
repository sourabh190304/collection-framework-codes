package collection_priyanka_mam;
public class print_1_10_usingrecussion {

	static void print(int num) //base condition / base class 
	{
		if(num==11) {
			return;
		}
		System.out.println(num);
		print(num+1);
	}
	
//	static void print(int num)2 {
//		if(num==11)false {
//			return;
//		}
//		System.out.println(num)2;
//		print(num+1)3;
//	}
	
	// num++ upto (num==11) condition not satisfied & print 1 to 10
	
//	static void print(int num)11 {
//	if(num==11)true {
//		return;
//	}
//	System.out.println(num);
//	print(num+1);
//}
	
	//when condition gets satisfied it will stop at a return only and 
	//not even execute single line afer that 
		
	
	
	public static void main(String[] args) {
		int num=1;
		print(num);
	}
}
