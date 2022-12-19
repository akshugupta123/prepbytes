/*
 * You are given two float numbers 
N
 and 
M
. You have to print both numbers 
N
 and 
M
 separated by a space.

Note:- Print the output till 
2
 digits after decimal point.

Input Format
The first line of input contains two float numbers 
N
 and 
M
.

Output Format
Print both the number 
N and M separated by a space. 

Constraints
1
<=
N
,
M
<=
100

Time Limit
 0.5 second

Example
Sample Input
10.20 2.35

Sample Output
10.20 2.35*/

package javacoding_package;
import java.util.*;
import java.io.*;

public class PrintFloatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      float a=sc.nextFloat();
	      float b=sc.nextFloat();
	      
	      System.out.printf("%.2f %.2f",a ,b);
	      
	}

}
