package AbstractionProgram;

public class Oracle implements MyDatabase {
	public void commit()
	{
		System.out.println("Oracle commit method");
	}
	public void rollback()
	{
		System.out.println("Oracle rollback method");
	}
}
