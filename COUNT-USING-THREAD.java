# COUNT-USING-THREAD
package oxygen.com;
public class Threads extends Thread{
static int count=1;
static void increment()
{
	count++;
}
	public static void main(String[] args) throws InterruptedException
	{
Threads t=new Threads();
t.start();
Thread.sleep(1000);
System.out.println("count is:"+count);
	}
public void run()
{
	increment();
}
}
OUTPUT:
count is:2
