package Thread_All_Methods_In_ThreadClass;

public class ThreadClass {
	public static void main(String[] args) {

		Thread t1=new Thread();

		// we can not set the id 
		// only we can get the id 
		System.out.println(t1.getId());

		// set name 
		t1.setName("SeetaRam");

		// get name
		System.out.println(t1.getName());

		//
		t1.setPriority(8);
		System.out.println(t1.getPriority());

		// we can get at what state the thread is there 
		System.out.println(t1.getState());

		// to move our thread from new to runnable state 
		t1.start();
		System.out.println(t1.getState());

		// can make thread to sleep means wait for some period of time
		try {
			t1.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// to destroy or stop the thread 
		t1.stop();
		System.out.println(" thread is destroyed ");


	}
}
