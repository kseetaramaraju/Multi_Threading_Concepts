package differenceBetween_Start_And_RunMethods;

public class Student extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}
