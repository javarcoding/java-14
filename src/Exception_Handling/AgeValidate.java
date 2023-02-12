package Exception_Handling;

import java.util.Scanner;

public class AgeValidate {
	
	public void ageCheck() throws AgeFoundException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your Age");
		int age=sc.nextInt();
		
		if (age<18)
		{
			throw new AgeFoundException("You are not Eligible for Voting");
		}
		else
		{
			System.out.println("You are Eligible for Voting");
		}
	}

	public static void main(String[] args) throws AgeFoundException {
		
		AgeValidate a=new AgeValidate();
		a.ageCheck();
		

	}

}
