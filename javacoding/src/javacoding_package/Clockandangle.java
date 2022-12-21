
/*Clock and Angles
PrepBuddy has an analog clock which consists of two hands one for hour and another for minute. She wants to calculate the shorter angle formed between hour and minute hand at any given time.

Input format
The first line contains the number of test cases 
T
. 
Each test case contains two integers 
h
 and 
m
 representing the time in hour and minute format.

Output format
For each test case on a new line, print the required shorter angle.

Constraints
1
<=
T
<=
5

All valid times

Time Limit
1
 second

Example
Input
2

5
 
30

6
 
00

Output
15

180*/
package javacoding_package;
import java.util.*;
import java.io.*;
public class Clockandangle {
	static int calcAngle(double h, double m) 
    { 
        // validate the input 
        if (h <0 || m < 0 || h >12 || m > 60) 
            //System.out.println("Wrong input"); 
  
        if (h == 12) 
            h = 0; 
        if (m == 60)  
            m = 0; 
  
        // Calculate the angles moved by hour and minute hands 
        // with reference to 12:00 
        int hour_angle = (int)(0.5 * (h*60 + m)); 
        int minute_angle = (int)(6*m); 
  
        // Find the difference between two angles 
        int angle = Math.abs(hour_angle - minute_angle); 
  
        // smaller angle of two possible angles 
        angle = Math.min(360-angle, angle); 
  
        return angle; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(calcAngle(5, 30)); 
	     System.out.println(calcAngle(6, 00)); 
	     System.out.println(calcAngle(11, 00)); 
         System.out.println(calcAngle(11, 50));

	}

}
