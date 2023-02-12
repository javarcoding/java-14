package InheritanceProgram;

public class C extends B
{
	public void ministatement()
	{
		System.out.println("method ministatement classC");
	}
      public static void main(String[] args)
      {
    	  C c=new C();
    	  c.ministatement();
      }
}
