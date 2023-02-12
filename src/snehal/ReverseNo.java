package snehal;

import java.util.Scanner;

public class ReverseNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number");
	int no=sc.nextInt();
	
	int temp=no;    //1221
	int rev=0,rem;
	
	while (temp!=0) {
		rem=temp%10;     //1
		rev=rev*10+rem;  //1221
		temp=temp/10; //.0
		
	}
     System.out.println("Reverse is:"+rev);

}
}
