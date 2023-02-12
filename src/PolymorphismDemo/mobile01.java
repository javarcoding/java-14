package PolymorphismDemo;

public class mobile01 {

	
	public void camera(StringBuffer sb)
	{
		System.out.println("StringBuffer class==");
		
	}
	public void camera(String s)
	{
		System.out.println("String class==");
		
	}
	public static void main(String[] args)
	{
		mobile01 m=new mobile01();
		//m.camera(null);
	}
}
