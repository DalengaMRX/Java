/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_02 {
	public static void main(String[] args) {
		
		/*2 - Crie um programa para receber um valor qualquer
		 *e apresente como resposta se esse n�mero � par ou 
		 *impar.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0 ) {
			System.out.print("O n�mero " + num1 +" � Par.");
		} else {
			System.out.print("O n�mero " + num1 +" � Impar.");
		}
		
		sc.close();
	}
}
