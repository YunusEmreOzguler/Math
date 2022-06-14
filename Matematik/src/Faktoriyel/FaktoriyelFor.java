package Faktoriyel;

import java.util.Scanner;

public class FaktoriyelFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		int x=1;
		
		if(n<0) {
			System.out.println("You entered wrong value.");
		}
		else if(n==0) {
			System.out.println("Value : " + x);
		}
		else {
			for(int i=1 ; i<=n ; i++) {
				x *= i;
			}
		System.out.println("Value : " + x);
		}
		
		input.close();
	}
}
