/**
 * 
 */
package basicsOfJava;

/**
 * @author Dhanunjaya
 *
 */
import java.util.*;
public class revString {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String rev="";
String str=sc.nextLine();
char ch[]=str.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
	rev+=ch[i];
}
System.out.println(rev);

StringBuilder str1= new StringBuilder();	//using stringBuider method
String str2=sc.nextLine();
str1.append(str2);
str1.reverse();
System.out.println(str1);
	}
}
