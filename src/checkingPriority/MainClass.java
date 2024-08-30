package checkingPriority;

public class MainClass {
	public static void main(String[] args)  {


		Person s3=new Person();
		s3.setName("Person 3");
		s3.setPriority(10);
		s3.start();

		try {
			s3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Person s2=new Person();
		s2.setName("Person 2");
		s2.setPriority(5);
		s2.start();
		//s2.yield();

		try {
			s2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		Person s1=new Person();
		s1.setName("Person 1");
		s1.setPriority(1);
		s1.start();
		//s1.yield();


		Tom t1=new Tom();
		t1.setName("Tom 1");
		t1.setPriority(1);
		t1.start();
		//t1.notify();
		//t1.yield();

		Tom t2=new Tom();
		t2.setName("Tom 2");
		t2.setPriority(5);
		t2.start();
		//		try {
		//			t2.wait(5000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//t2.yield();

		Tom t3=new Tom();
		t3.setName("Tom 3");
		t3.setPriority(10);
		t3.start();
		//		try {
		//			t3.join();
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}


	}

}
