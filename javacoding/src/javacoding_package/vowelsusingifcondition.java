package javacoding_package;
import java.util.*;
import java.io.*;

public class vowelsusingifcondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')//checking if else condtion vowel or not
			System.out.println(ch+"is a vowel ");
		else
			System.out.println(ch+"is not a vowel ");
		// TODO Auto-generated method stub

	}

}
