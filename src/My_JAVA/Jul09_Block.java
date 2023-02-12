package My_JAVA;

public class Jul09_Block
 {
    static
    {
    	System.out.println("This is static block");
    }
	public Jul09_Block()
	{
		System.out.println("This is constructor");
	}
	{
		System.out.println("This is instant Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is start main method");
		Jul09_Block d=new Jul09_Block();
		System.out.println("This is end main Method");

	}

}
