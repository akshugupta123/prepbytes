package javacoding_package;
import java.util.*;
import java.io.*;
public class Charvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='P'||ch=='p')
			System.out.println("peacock");
		else if(ch=='Z'||ch=='z')
			System.out.println("Zebara");
		else if(ch=='D'||ch=='d')
			System.out.println("data structure");
		else 
			System.out.println("expert code");		
	}

}
