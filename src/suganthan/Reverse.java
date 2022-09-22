package suganthan;

public class Reverse {

	public static void main(String args[])
	{
		int n=7589;
		int r=0;
		
		while(n>0)
		{
		int rem=n%10;
		n=n/10;
		r=r*10 + rem;
		}
		System.out.println(r);
		
	}
}
