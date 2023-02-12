package Overriding;

public class B extends A
{
	public void show(String s, int a)
	{
		System.out.println("class B show method");
	}
	
	public static void main(String[] args)
	{
		A a=new B();
		//a.show("Raj");
	
	}

}
