package Overriding;

public class Oracle extends MySQL
{

	public void commit()
	{
		System.out.println("Oracle call commit method");
	}
	public void rollback()
	{
		System.out.println("Oracle call rollback method");
	}
	public static void main(String[] args)
	{
		MySQL m=new Oracle();
		m.commit();
		m.rollback();
		
		
	}
}
