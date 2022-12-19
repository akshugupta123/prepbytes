/*
 * You are given three inputs, first an integer number, second a float number, and third a character. You have to print all the inputs in a single line separated by a dollar sign($).

Note:- Output order must be the same as the input order.
Note:- In float number, only two digits you have to print after the decimal.

Example:-
Input:- 1 2.1 a
Output:- 1$2.10$a 
Input Format
The first line contains three input 
N
, 
M
 and 
c
h
 where  
N
 is an integer number, 
M
 is a float number and 
c
his a character.
Output Format
You have to print the all inputs separated by a dollar sign($).
Constraints
0<=N,M <=100
a<=ch<=z

Time Limit
 1 second

Example
Sample Input
4 2.01 a
Sample Output
4$2.01$a*/
package javacoding_package;
import java.util.*;
import java.io.*;

public class MixedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int intVar=sc.nextInt();
	      float floatVar=sc.nextFloat();
	      char charVar=sc.next().charAt(0);
	      
	      System.out.printf("%d$%.2f$%c",intVar,floatVar,charVar);

	}

}
