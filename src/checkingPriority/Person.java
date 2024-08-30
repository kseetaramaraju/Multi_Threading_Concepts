package checkingPriority;

public class Person extends Thread{

	@Override
	public void run() {

		System.out.println("Current Thread :"+Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		Person s1=new Person();
		s1.setName("Person 1");
		s1.setPriority(1);
		s1.start();
		//s1.yield();

		//		try {
		//			s1.join();
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}


		Person s3=new Person();
		s3.setName("Person 3");
		s3.setPriority(10);
		s3.start();

		//		try {
		//			s3.join();
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}


		Person s2=new Person();
		s2.setName("Person 2");
		s2.setPriority(5);
		s2.start();

		//		try {
		//			s2.join();
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}











	}

}
