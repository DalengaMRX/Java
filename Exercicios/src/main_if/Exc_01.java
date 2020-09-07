/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_01 {
	public static void main(String[] args) {
		
		/*1 - Crie um programa para receber um valor qualquer e
		 *apresente como resposta se esse número é positivo ou 
		 *negativo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();
		
		if(num1 > 0){
			System.out.print("O número " + num1 + " é Positivo");
		}
		else if (num1 < 0) {
			System.out.print("O número " + num1 + " é Negativo");
		}
		
		sc.close();
	}
}
