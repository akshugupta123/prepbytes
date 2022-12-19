/*You are given a character 
c
h
. You have to print the character 
c
h
 same as it is.

Note:- Character 
c
h
 will contain only lowercase English letters.

Input Format
The first line of input contains a character 
c
h
.

Output Format
Print the character 
c
h
 same as it is.

Constraints
a<=c h<=z

Time Limit
 0.5 second

Example
Sample Input
a

Sample Output
a*/


package javacoding_package;
import java.util.*;
import java.io.*;

public class Printcharacter {

	public static void main(String args[]) throws IOException {
	     Scanner sc = new Scanner(System.in);   

	     char c = sc.next().charAt(0);   
	//prints the character   
	System.out.println(c); 

	}

}
