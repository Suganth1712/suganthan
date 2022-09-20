package suganthan;

public class Swap {
	public static void main(String args[])
	{
		int num=34567;
		int sum=0;
		while (num>0)
		{
			int a=num%10;
			sum=sum+a;
			System.out.println(sum);
			num=num/10;
		}
		
	}

}
