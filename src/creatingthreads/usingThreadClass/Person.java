package creatingthreads.usingThreadClass;

public class Person extends Thread{

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{

		Person p=new Person();
		p.setName(" Seetaram ");
		p.start();

	}

}
