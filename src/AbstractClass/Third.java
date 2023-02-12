package AbstractClass;

public class Third extends Second implements Calculator {

	public void div()
	{
		System.out.println("div method third");
	}
	public static void main(String[] args) 
	{
		Third t=new Third();
		t.add();
		t.mul();
		t.div();

	}

}
