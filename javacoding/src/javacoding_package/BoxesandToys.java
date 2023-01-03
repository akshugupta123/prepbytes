package javacoding_package;
import java.util.*;
import java.io.*;

public class BoxesandToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        int count = 0;
	        while(t!=0){
	            int toys = s.nextInt(), capacity = s.nextInt();
	            if(max_capacity(toys,capacity) >= 2){
	                count = count + 1;
	            }
	            t--;
	        }
	        System.out.println(count);
	    }

	    private static int max_capacity(int toys, int capacity) {
	        return (capacity - toys);
	    }

	}


