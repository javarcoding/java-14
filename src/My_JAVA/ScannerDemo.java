package My_JAVA;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter You Name ");
		
		String myName=sc.next();
		
		System.out.println("Please Enter Your Mobile No");
		
		int mobileNo=sc.nextInt();
		
		System.out.println("My Name is=="+myName);
		System.out.println("My Mobile No=="+mobileNo);

	}

}
