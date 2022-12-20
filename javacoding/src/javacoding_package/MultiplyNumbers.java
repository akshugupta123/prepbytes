/*
 * Multiply Numbers
Let's practice multiplication a bit.
Write a program to take two integers 
x
 and 
y
 as input from the user, multiply those integers and print the product.

Input format
Two space-separated integers are provided 
x
 and 
y
.

Output format
Print a single integer representing the product of 
x
 and 
y
 as output.

Constraints
−
10
<=
a
,
b
<=
40

Time Limit
1
 second

Example
Input
5
 
5

Output
25

Sample Test Case Explanation
5∗5=25
*/
package javacoding_package;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class MultiplyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int a,b;
	       a=sc.nextInt();
	       b=sc.nextInt();
	      System.out.println(a*b);
	}

}
