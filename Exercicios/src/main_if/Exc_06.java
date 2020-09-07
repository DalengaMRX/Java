package main;

import java.util.Scanner;

public class Exc_06 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int num = 0;
		
		System.out.print("Digite um numero: ");
		num = sc.nextInt();
		System.out.println("\n");
		
		if(num < 0 && num > 100) {
			System.out.println("O numero está fora do intervalo");
			
		} else if(num > 0 && num < 26) {
			System.out.println("O numero está entre 0 e 25");
			
		} else if(num > 25 && num < 51) {
			System.out.println("O numero está entre 26 e 50");
			
		} else if (num > 50 && num < 76) {
			System.out.println("O numero está entre 51 e 75");
			
		} else if(num > 75 && num < 101) {
			System.out.println("O numero está entre 75 e 100");
		}
		
		sc.close();
	}
}
