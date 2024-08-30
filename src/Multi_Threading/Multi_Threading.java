package Multi_Threading;

class Netflix
{
	public synchronized void watchingMovie(String name)
	{
		System.out.println(name +" is Watching Movie ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" Completed Wacthing Movie ");
	}
}

class Person extends Thread
{
	Netflix netflix;
	String name;
	public Person(Netflix netflix,String name) {
		super();
		this.netflix = netflix;
		this.name = name;
	}
	@Override
	public void run()
	{
		netflix.watchingMovie(name);
	}

}
public class Multi_Threading 
{
	public static void main(String[] args) 
	{
		Netflix n=new Netflix();
		Person p1=new Person(n,"Deva");
		Person p2=new Person(n,"raju");
		Person p3=new Person(n,"suresh");

		p1.start();
		p2.start();
		p3.start();
	}


}


