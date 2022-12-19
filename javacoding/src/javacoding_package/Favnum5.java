/*favnum=5
 * T=3
 * N=12345 ITS RETURN 1 how many times number printed 5 
 * N%10
 * IF 123/10 12.3 .3 TRUNCATE THE NUMBER
 * STEPS
 * 1)T
 * 2)LOOP(T)
 * 3)N
 * 4)rem,count=0;
 * 5)loop(n!=0)
 * 6)rem=n%10;
 * 7)if(rem==5)
 * cont++
 * n=n/10;
 * print cont*/


package javacoding_package;
import java.util.*;
import java.io.*;

public class Favnum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int rem,count=0;
			while(n!=0)
			{
				rem=n%10;
				n=n/10;
				if(rem==5)
				{
					count++;
			}
				System.out.println(count);
		}

	}

	}
}
