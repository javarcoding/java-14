package Overriding;

public class Child extends Parent
{

	public void marraige()
	{
		System.out.println("Kajal");
	}
	public static void main(String[] args)
	{
		Parent p1=new Parent();
		p1.marraige();
		
		Parent p2=new Child();
		p2.marraige();
	}
}
