import java.util.Random;
public class MultiThread
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
	}
}
class Thread1 extends Thread
{
	Random r;
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				r=new Random();
				int num=r.nextInt(100);
				if(num%2==0)
				{
					even t2=new even(num);
					t2.start();
				}
				else
				{	
					odd t3=new odd(num);
					t3.start();
				}
				Thread.sleep(1000);// one second
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception is "+e);
        }
    } 
}
class even extends Thread
{
	int x;
	even(int x)
	{
	  this.x=x;
	}
	public void run()
	{
		System.out.println(x+" is even, it's square is "+(x*x));
	}
}
class odd extends Thread
{
	int x;
	odd(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println(x+" is odd, it's cube is "+(x*x*x));
	}
}
