package snehal;

import java.util.Scanner;

public class FibonnaciSeriesUser1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		int no=sc.nextInt();
		
		int a=0, b=1, c;
		
		for (int i=1;i<=no;i++) { //i=0,1,2,3,4,5
	         c=a+b;//8,
	         System.out.println(c);//1,2,3,5,8
			a=b;//5
			b=c;//8
		}
	}

}
