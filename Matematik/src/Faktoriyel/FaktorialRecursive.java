package Faktoriyel;

import java.util.Scanner;

public class FaktorialRecursive {
	
	public static int Fact(int n) {
		if (n <= 1)
	         return 1;
	      else
	         return n * Fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = input.nextInt();
		System.out.println("Factorial value : " + Fact(x));
		input.close();
	}
	
}
