package collection_priyanka_mam;
public class factorial_using_reccuion

{
	static int fact(int num) {
		if(num==1) 
		{
			return 1;  
		}
		else {
			return num*fact(num-1);
		}
	}
	public static void main(String[] args) {
		int num=5;
		int x=fact(num);
		System.out.println(x);
	}
}
