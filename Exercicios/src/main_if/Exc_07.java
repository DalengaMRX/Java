package main;

import java.util.Scanner;

public class Exc_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("Insira o eixo x: ");
		x = sc.nextInt();
		System.out.println("\n");
		
		System.out.print("Insira o eixo y: ");
		y = sc.nextInt();
		System.out.println("\n");
		
		if(x >= 0 && y >= 0 ) {
			System.out.println("está localizado no Q1 ");
			
		} else if(x <= 0 && y >= 0) {
			System.out.println("está localizado no Q2 ");
			
		} else if (x <= 0 && y <= 0) {
			System.out.println("está localizado no Q3 ");
			
		} else if (x >= 0 && y <= 0) {
			System.out.println("está localizado no Q4 ");
		}
		
		sc.close();
	}
}
