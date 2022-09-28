package suganthan;

public class Electricbillcalculate {
	public static void main(String args[])
	{
		int unit=323;
		double cost;
		float rem,total;
		
		if(unit<=100)
		{
			System.out.println("Bill to pay:0");
		}
		else if(unit<=200)
		{
			unit=unit-100;
			System.out.println("Bill to pay:"+unit*1.5);
		}
		else if(unit<=500)  //100*0,100*2=200(constant)
		{
			rem=unit-200;
			cost=rem*3;
			total=(float)(cost+200);
			System.out.println("Bill to pay:"+total);
		}
		else if(unit>500)  //100*0,100*3.5=350,300*4.6=1380, total=1750(constant)
		{
			rem=unit-500;
			cost=rem*6.6;
			total=(float)(cost+1730);
			System.out.println("Bill to pay:"+total);
		}
	}

}
