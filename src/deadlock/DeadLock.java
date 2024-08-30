package deadlock;

public class DeadLock {
	public static void main(String[] args) {


		String manoj="Manoj Sir";
		String uday="Uday Sir";

		Thread t1=new Thread("deva")
		{
			@Override
			public void run() 
			{
				synchronized (manoj) {
					System.out.println(Thread.currentThread().getName()+" Locked "+manoj+" Object ");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (uday) {
						System.out.println(Thread.currentThread().getName()+" Locked "+uday+" Object ");
					}
				}
			}
		};

		Thread t2=new Thread("raju")
		{
			@Override
			public void run() 
			{
				synchronized (manoj) {
					System.out.println(Thread.currentThread().getName()+" Locked "+manoj+" Object ");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (uday) {
						System.out.println(Thread.currentThread().getName()+" Locked "+uday+" Object ");
					}
				}
			}
		};

		t1.start();
		t2.start();


	}
}
