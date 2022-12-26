package javacoding_package;
import java.util.*;
import java.io.*;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//t z=sc.nextInt();
		if(x<y) {
			
				System.out.println(x+"is smaller than "+y);
		}
		else if(x>y) {
			
				System.out.println(x+"is greater than"+y);
				
		}
		else {
			
				System.out.println(x+"is equal to the"+y);
		}
	}

}
