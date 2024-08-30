package differenceBetween_Start_And_RunMethods;


public class Mainclass {
	public static void main(String[] args) {

		Student s=new Student();
		s.setName("ram");

		s.start();
		s.run();

		for(int i=0;i<5;i++)
		{
			System.out.println(" Main Thread ");
		}


	}

}
