/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_02 {
	public static void main(String[] args) {
		
		/*2 - Crie um programa para receber um valor qualquer
		 *e apresente como resposta se esse número é par ou 
		 *impar.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0 ) {
			System.out.print("O número " + num1 +" é Par.");
		} else {
			System.out.print("O número " + num1 +" é Impar.");
		}
		
		sc.close();
	}
}
