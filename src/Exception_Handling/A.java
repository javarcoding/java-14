package Exception_Handling;

public class A {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			 System.out.println(10/0);
		    }
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("get massage method=="+e.getMessage());
			System.out.println("To string method=="+e.toString());
		}
		System.out.println("5");

	}

}
