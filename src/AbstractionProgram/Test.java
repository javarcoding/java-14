package AbstractionProgram;

public class Test 
{
     
     public static void main(String[] args)
     {
    	 A b=new D();
    	 b.show();
    	 b.display();
    	 
    	 D d=new D(); //called default method 
    	 d.display();
    	 
    	 A.m();       //called static method 
     }
}
