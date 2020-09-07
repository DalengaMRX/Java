/*
 * author                Matheus Dalenga
 */
package main_while;

import java.util.Scanner;

public class Exc_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.println("*** PLANO CARTESIANO ***");
		System.out.println("");
		
		System.out.print("Insira o valor do eixo X: ");
		x = sc.nextInt();
		System.out.println("");
		
		System.out.print("Insira o valor do eixo Y: ");
		y = sc.nextInt();
		System.out.println("");
		
		while(!(x == 0 || y == 0)) {
			
			if(x > 0 && y > 0 ) {
				System.out.println("* Está localizado no Q1 *");
				System.out.println("");
				
			} else if(x < 0 && y > 0) {
				System.out.println("* Está localizado no Q2 *");
				System.out.println("");
				
			} else if (x < 0 && y < 0) {
				System.out.println("* Está localizado no Q3 *");
				System.out.println("");
				
			} else if (x > 0 && y < 0) {
				System.out.println("* Está localizado no Q4 *");
				System.out.println("");
			}
			
			System.out.print("Insira o valor do eixo X: ");
			x = sc.nextInt();
			System.out.println("");
			
			System.out.print("Insira o valor do eixo Y: ");
			y = sc.nextInt();
			System.out.println("");
			
		}
		
		System.out.println("Fora do intevalo");
		
		sc.close();
	}
}
