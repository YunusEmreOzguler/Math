package AsalSayi;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int x = input.nextInt();
		int counter=0;
		
		for(int i=1 ; i<=x ; i++) {
			if (x%i==0) {
				counter++;
			}
		}
		
		if(counter==2) {
			System.out.println("Your entered number is a Prime number ! ");
		}
		else {
			System.out.println("Your entered number is not a Prime number ! ");
		}
	
		input.close();
	}
}
