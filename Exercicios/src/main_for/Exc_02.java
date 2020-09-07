/*
 * author                Matheus Dalenga
 */
package main_for;

import java.util.Scanner;

public class Exc_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtd = 0;
		int dentro  = 0 ;
		int fora  = 0 ;
		int valor = 0;
		
		System.out.println("*** Intervalos ***");
		System.out.println("");
		
		System.out.println("** Intervalo de 0 á 15 **");
		System.out.println("");
		
		System.out.print("Insira a quantidade valores a serem inseridos: ");
		qtd = sc.nextInt();
		System.out.println("");
		
		for(int i = 1; i <= qtd; i++) {
			
			System.out.print("Insira o "+ i +"° Valor: ");
			valor = sc.nextInt();
			
			if(valor <= 15) {
				dentro ++;
			}
			
			else if(valor > 15) {
				fora ++;
			}
			
		}
		
		System.out.println("");
		
		System.out.println(dentro+" Valor(es) dentro do intervalo estabelecido!");
		System.out.println(fora+" Valor(es) fora do intervalo estabelecido!");
		
		sc.close();
	}
}
