/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salario = 0;
		
		System.out.print("Insira o valor do seu salário: ");
		salario = sc.nextFloat();
		
		if (salario <= 2000) {
			System.out.println("Seu salário esta insento de impostos.");
		}
		
		else if(salario <= 3000) {
			float imposto = (float)(0.08 * 2000);
			System.out.println("O valor total do seu salário é de R$ "+ (salario - imposto)+ " Reais.");
		}
		
		else if(salario <= 4500) {
			float imposto1 = (float)(0.18 * 3000);
			float imposto2 = (float)(0.08 * 1000);
			System.out.println("O valor total do seu salário é de R$ "+ ((salario - imposto1)- imposto2)+ " Reais.");
		}
		
		else if(salario > 4500) {
			float imposto1 = (float)(0.28 * 4500);
			float imposto2 = (float)(0.18 * 1500);
			float imposto3 = (float)(0.08 * 1000);
			System.out.println("O valor total do seu salário é de R$ "+ (((salario - imposto1)- imposto2)- imposto3)+ " Reais.");
		}
		
		sc.close();
	}
}
