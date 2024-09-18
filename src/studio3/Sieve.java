package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number n input: ");
		int n = in.nextInt();
		
		boolean[] number = new boolean [n];
		int prime = 2;
		
		while (prime <= n) {
			System.out.print(prime + ", ");
			prime++;
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
		}

	}

}
