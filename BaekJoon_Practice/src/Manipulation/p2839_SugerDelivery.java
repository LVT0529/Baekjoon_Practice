package Manipulation;

import java.util.Scanner;
public class p2839_SugerDelivery {
	public static void main(String[] args) {
		int count = 0;
		int total_k;
		
		Scanner input = new Scanner(System.in);
		
		total_k = input.nextInt();
		
		
		if(total_k % 5 == 0) { 
			System.out.println(total_k/5);
		}
		else if(total_k % 5 != 0 || total_k % 3 != 0)
		{
			count = total_k/5;
			total_k %= 5;
			if(total_k % 3 == 0)
				count += total_k/3;
			else
				count = -1;
			
			System.out.println(count);
		}
		else
		{
			System.out.println(total_k/3);
		}
			
		input.close();
	}
}
