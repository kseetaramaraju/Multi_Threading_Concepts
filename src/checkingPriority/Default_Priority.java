package checkingPriority;

class MyThread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class Default_Priority 
{
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(9);

		MyThread t=new MyThread();
		t.start();
		System.out.println(t.getPriority());

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
