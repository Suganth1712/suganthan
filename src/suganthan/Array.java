package suganthan;

public class Array {

	public static void main(String args[])
	{
		int b[]= {2,3,4,5,8,9};
	    int i=0;
	    int j=b.length-1;
	    while(i<j)
	    {
	    	int temp=b[i];
	    	b[i]=b[j];
	    	b[j]=temp;
	    	i++;
	    	j--;
	    	
	    }
		
		for(int x:b)
		{
			System.out.print (x);
		}
	    
	}		
}