/*Shopping Cost
Tina is preparing a shopping list containing 
N
 items. She knows the quantity and price of each item on the list. The shop is offering a 
20
%
 discount on the items with a quantity of more than 
100
 units. Given the quantity and price of each of the 
N
 items, your task is to calculate how much each item will cost.

Input format
The first line of the input contains an integer 
N
 denoting the number of items
Each of the next 
N
 lines contains two space-separated integers denoting the quantity and price of the item.

Output format
Print the final cost that Tina has to bear for each item. Print till a single digit after the decimal point.

Constraints
1
<=
N
<=
10

1
<=
quantity,price<=103

Time Limit
1
 second

Example
Input
3
100
 120
200
 100
50
 50
Output
12000.0
16000.0
2500.0
*/



package javacoding_package;
import java.util.*;
import java.io.*;

public class ShoppingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Q,P,T;
	        double Total,Final;
	        Scanner s = new Scanner(System.in);
	        T = s.nextInt();
	        while (T!=0) {
	            Q = s.nextInt();
	            P = s.nextInt();
	            Total = Q * P;
	            if(Q > 100){
	                Final = (Total * 20) / 100;
	                System.out.println(Total - Final);
	            }
	            else{
	                System.out.println(Total);
	            }
	            T--;
	        }  

	}

}
