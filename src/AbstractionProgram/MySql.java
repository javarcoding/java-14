package AbstractionProgram;

public class MySql implements MyDatabase {
	
	public void commit()
	{
		System.out.println("MySql commit method");
	}
	public void rollback()
	{
		System.out.println("MySql rollback method");
	}
}
