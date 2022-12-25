import java.util.*;

class checking
{
	int a,b,c;
	void insert(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void max()
	{
		if(a>b&&a>c)
		{
			System.out.println(a+" is maximum.");
		}
		else if(b>a&&b>c)
			 {
				System.out.println(b+" is maximum.");
			 }
			 else
			 {
				System.out.println(c+" is maximum.");
			 }
		
	}
	void min()
	{
		if(a<b&&a<c)
		{
			System.out.println(a+" is minimum.");
		}
		else if(b<a&&b<c)
			 {
				System.out.println(b+" is minimum.");
			 }
			 else
			 {
				System.out.println(c+" is minimum.");

			 }
		
	}
	
	
}
public class setA1
{
	public static void main(String[] args)
	{
		int a1,b1,c1;
		checking ch=new checking();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first num : ");
		a1=s.nextInt();
		System.out.println("Enter Second num : ");
		b1=s.nextInt();

		System.out.println("Enter third num : ");





		c1=s.nextInt();
		ch.insert(a1,b1,c1);
		ch.max();
		ch.min();
	}
}
