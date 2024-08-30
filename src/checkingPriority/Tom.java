package checkingPriority;

public class Tom extends Thread{

	@Override
	public void run() {

		System.out.println("Current Thread :"+Thread.currentThread().getName());

	}

}
