package AbstractionProgram;

public interface A 
{
	public void show(); //abstract method
	
	default void display()        //by using any class object default method
	{
		System.out.println("This is interface display method");
	}
	
	static void m()
	{
		System.out.println("Interface static m method");
	}
}
