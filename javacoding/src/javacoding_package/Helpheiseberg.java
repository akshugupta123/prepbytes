package javacoding_package;
//help heiseberg has N choclatewith invrese the choclate 1,2,3 -----N want distrub into tom and jeff
//|s2-s1| input is 5 output 0


import java.util.*;
import java.io.*;
public class Helpheiseberg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sum=n*(n-1)/2;
		if(sum%2==0)
			System.out.println(0);
		else
			System.out.println(1);

	}

}
