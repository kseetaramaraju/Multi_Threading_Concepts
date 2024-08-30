package creatingthreads.usingRunnableInterface.creatingthreads;

public class Person implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Person s=new Person();
		Thread t=new Thread(s,"Person Thread");
		t.start();
	}

}
