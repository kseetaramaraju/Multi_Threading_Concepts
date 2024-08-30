package DemonThread;


class MyDemonThread extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
	}

}


public class DemonThread extends Thread 
{
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().stop();
		// main thread is also a non-daemon thread and if all
		//the non-daemon threads are dead or they executed then 
		//the jvm will force fully terminates the all the daemon threads 


		MyDemonThread t1=new MyDemonThread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		t1.start();

	}


}
