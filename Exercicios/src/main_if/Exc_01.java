/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_01 {
	public static void main(String[] args) {
		
		/*1 - Crie um programa para receber um valor qualquer e
		 *apresente como resposta se esse n�mero � positivo ou 
		 *negativo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		if(num1 > 0){
			System.out.print("O n�mero " + num1 + " � Positivo");
		}
		else if (num1 < 0) {
			System.out.print("O n�mero " + num1 + " � Negativo");
		}
		
		sc.close();
	}
}
