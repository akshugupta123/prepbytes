package javacoding_package;
import java.util.*;
import java.io.*;

public class TenfromTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write your code here
	      int n,t,x = 0;
	        Scanner s = new Scanner(System.in);
	        t = s.nextInt();
	        while (t!=0) {
	            n = s.nextInt();
	            if (n % 5 == 0) {
	                if(n % 10 == 0){
	                    System.out.println("0");
	                }
	                else{
	                    do {
	                        n = n * 2;
	                        x++;
	                    }while(n % 10 != 0);
	                    System.out.println(x);
	                }
	            } else {
	                System.out.println("-1");
	            }
	            t--;
	        }
	    }
	}
		