//problem statement
//1)you are a given two integer represted by a and b and various mathematical operations needs to be performed on them
//opertions are a+b.a-b,a*b
//input format
//input is of single line containg two space separated integers
//output format
//print the result of (a+b),(a-b),(a*b)in different lines
//sample input
//5 6
//output format
//11
//-1
//30

package javacoding_package;
import java.util.*;

public class probcoding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);				
		int a,b;
		//System.out.print("enter the two values a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	}

}
//enter the two values a and b
//5 6
//11 -1 30