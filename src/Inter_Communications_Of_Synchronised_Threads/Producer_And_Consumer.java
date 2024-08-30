package Inter_Communications_Of_Synchronised_Threads;
class Q 
{
	int num;
	boolean producedOrNot=false;
	public synchronized void produce(int num) throws InterruptedException
	{
		while(producedOrNot)
		{
			wait();
		}
		this.num=num;
		System.out.println("Produced :"+num);
		producedOrNot=true;
		notify();
	}
	public synchronized void consume() throws InterruptedException
	{
		while(!producedOrNot)
		{
			wait();
		}
		System.out.println("Consume :"+num);
		producedOrNot=false;
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	public Producer(Q q) {
		super();
		this.q = q;
	}
	@Override
	public void run() 
	{
		int i=0;
		while(true)
		{
			try {
				q.produce(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	public Consumer(Q q) {
		super();
		this.q = q;
	}
	@Override
	public void run() 
	{
		while(true)
		{
			try {
				q.consume();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Producer_And_Consumer 
{
	public static void main(String[] args) throws InterruptedException {
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);

		Thread p1=new Thread(p,"Producer");
		Thread c1=new Thread(c,"Consumer");

		p1.start();
		c1.start();
	}
}
