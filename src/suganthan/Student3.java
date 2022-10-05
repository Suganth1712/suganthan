package suganthan;

public class Student3 {
	
	int rollNo;
	String name;
	int mark;
	char grade;
	
	void setGrade()
	{
		if( mark>=91)
		{
			grade='A';
		}
		else if(mark>=81)
		{
			grade='B';
		}
		else if(mark>=71)
		{
			grade='C';
		}
		else if(mark>=61)
		{
			grade='D';
		}
		else if(mark>=51)
		{
			grade='E';
		}
		else if(mark<=50)
		{
			grade='F';
		}
	}
	public static void main(String args[])
	{
		Student3 s1=new Student3();
		s1.rollNo=100;
		s1.name="mani";
		s1.mark=40;
		s1.setGrade();
		System.out.println(s1.grade);
		
		Student3 s2=new Student3();
		s2.rollNo=101;
		s2.name="mugils";
		s2.mark=92;
		s2.setGrade();
		System.out.println(s2.grade);
		
		Student3 s3=new Student3();
		s3.rollNo=102;
		s3.name="bharath";
		s3.mark=80;
		s3.setGrade();
		System.out.println(s3.grade);
		
		Student3 s4=new Student3();
		s4.rollNo=101;
		s4.name="pradeep";
		s4.mark=60;
		s4.setGrade();
		System.out.println(s4.grade);
}
}

