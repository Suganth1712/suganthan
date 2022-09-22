package suganthan;

public class Convert {
	
public static void main(String args[])
{
int n=11;
if(n%3==0 && n%5==0)
{
	System.out.println("bing bang");
}
else if(n%3==0)
{
	System.out.println("bing");
}
else if (n%5==0)
{
	System.out.println("bang");
}
else if (n%3!=0 && n%5!=0)
{
	System.out.println(n);
}
}
}
