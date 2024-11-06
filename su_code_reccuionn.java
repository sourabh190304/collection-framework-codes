package collection_priyanka_mam;

public class su_code_reccuionn {
	static int sum(int num) 
	{
		if(num>0) {
			return num+sum(num-1);
		}
		else
		{
			return 0;
		}
	}
public static void main(String[] args) {
	int num=10;
	int ans = sum(num);
	System.out.println(ans);
	
}
}
