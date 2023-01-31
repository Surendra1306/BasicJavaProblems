package basicsOfJava;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	int temp,rem;
	int rev=0;
	temp=n;
	while(n>0) {
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	if(temp==rev)
	System.out.println("given numer is a palindrome");
	else
	System.out.println(temp+" is not a palindrome number");
	}			
}
