package Manipulation;

import java.util.Scanner;
public class p2839_SugerDelivery {
	public static void main(String[] args) {
		int count = 0;
		int total_k, temp;
		
		Scanner input = new Scanner(System.in);
		
		total_k = input.nextInt();
		
		
		if(total_k % 5 == 0) { 
			System.out.println(total_k/5);
		}
<<<<<<< HEAD
=======
		else if(total_k % 5 != 0 && total_k % 3 != 0)
		{
			count = total_k/5;
			total_k %= 5;
			if(total_k % 3 == 0)
				count += total_k/3;
			else
				count = -1;
			
			System.out.println(count);
		}
>>>>>>> 3868863b24975ed19898e22b90c40e0594a44815
		else
		{
			temp = total_k;
			while(total_k > 0) {
				total_k -= 5;
				count++;
				
				if((total_k-5)%3 ==0) {
					count++;
					total_k -= 5;
					count += total_k/3;
					total_k %= 3;
				}
				
				if(total_k % 3 == 0 && total_k >= 3) {				
					count += total_k/3;
					total_k %= 3;
				}
			}
			if(total_k == 0)
				System.out.println(count);
			else if(temp % 3 == 0)
				System.out.println(temp/3);
			else
				System.out.println("-1");
		}
			
		input.close();
	}
}
