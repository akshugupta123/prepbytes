package javacoding_package;
import java.util.*;
import java.io.*;

public class Switchcasealternativelogicvowelornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':	
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+"is a vowel");
			break;
		default:
			System.out.println(ch+"is not a vowel");
			
		}


	}

}
//alternative switch case using vowel or not reduced the statement