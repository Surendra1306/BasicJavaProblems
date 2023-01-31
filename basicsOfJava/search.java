package basicsOfJava;
import java.util.*;
public class search {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int size=sc.nextInt();
		 int arr[]=new int[size];
		 System.out.println("enter elements");
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int c=0;
		 System.out.println("search element");
		 int search=sc.nextInt();
		 for(int i=0;i<size;i++) {
			 if(arr[i]==search)
				 c++;
			 break;
		 }
if(c==1)
	System.out.println("element found");
else
	System.out.println("element not found");
	}
}
