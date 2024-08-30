package Thread_Life_Cycle;

public class Thread_Life_Cycle {
	public static void main(String[] args) {

		// THREAD LIFE WILL BE IN THESE 6 STATES 
		// 1 NEW 
		// 2 RUNNABLE 
		// 3 BLOCKED 
		// 4 WAITING (JOIN) 
		// 5 TIMED WAITING (SLEEP) 
		// 6 TERMINATED  

		Thread t1=new Thread("Seetaram");
		System.out.println(t1.getState());


		t1.start();
		System.out.println(t1.getState());

		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(t1.getState());


	}

}
