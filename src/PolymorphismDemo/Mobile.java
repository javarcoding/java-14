package PolymorphismDemo;

public class Mobile 
{
    public void camera(A sb )
    {
    	System.out.println("A class==");
    }
    public void camera(B s)
    {
    	System.out.println("B class==");
    }
    public static void main (String[] args)
    {
    	Mobile m=new Mobile();
    	m.camera(null);
    	  
    }
}
