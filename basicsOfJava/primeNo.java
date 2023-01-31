package basicsOfJava;
import java.util.*;

public class primeNo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int count=0;
for(int i=1;i<=num;i++) {
	if(num%i==0) 
		count++;
}
if(count==2) 
	System.out.println("Prime number");
else 
	System.out.println(" not a prime number");
}
}

/*
import java.util.Scanner;
public class primeNo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int count, i,j;
for(i=2;i<=num;i++) {
	 count=0;
	for(j=1;j<=i;j++) {
		if(i%j==0)
			count++;	
	}	
if(count==2) 
	System.out.print(i+" ");
}
}
}
*/