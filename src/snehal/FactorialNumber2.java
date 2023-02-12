package snehal;

import java.util.Scanner;

public class FactorialNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number::");
		int no=sc.nextInt();
		
		int fact=1;
		
		for (int i=1;i<=no;i++) { //i=0,1,2,3,4,5
	         fact=fact*i;  //24
		}
		System.out.println(fact);
	}

}
