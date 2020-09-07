/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int multiplo = 0;
		int divisor = 0;
		int aux = 0;
		
		System.out.println("*** Números Multiplos ***\n");
		
		System.out.print("Insira o primeiro número Inteiro: ");
		multiplo = sc.nextInt();
		System.out.println("");
		
		System.out.print("Insira o segundo número Inteiro: ");
		divisor = sc.nextInt();
		System.out.println("");
		
		aux = (multiplo / divisor);
		
		if(multiplo % divisor == 0) {
			System.out.println("O Número " + multiplo + " é multiplo de "+ aux);
		} else {
			System.out.println("O Número "+ multiplo + " não é multiplo de "+aux);
		}
		
		sc.close();
	}
}