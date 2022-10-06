package suganthan;

public class Fibnocci {
	public static void main(String args[])
	{
		int n=-1;
		int n1=1;
		int n2 = 0;
		for(int i=0;i<=7;i++)
		{
			n2=n+n1;
			System.out.println(n2);
		
			n=n1;
			n1=n2;
		}
	}

}
