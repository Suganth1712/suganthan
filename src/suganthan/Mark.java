package suganthan;

public class Mark {
	int m1,m2,m3,m4,m5;
	void calculate()
	{
		System.out.println(m1+m2+m3+m4+m5);
	}
	public static void main(String args[])
	{
		Mark pradeep =new Mark();
		pradeep.m1=35;
		pradeep.m2=60;
		pradeep.m3=40;
		pradeep.m4=40;
		pradeep.m5=50;
		pradeep.calculate();
		
		Mark suganth=new Mark();
		suganth.m1=100;
		suganth.m2=99;
		suganth.m3=100;
		suganth.m4=100;
		suganth.m5=100;
		suganth.calculate();
		
		
	}
	

}
