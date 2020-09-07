/*
 * author                Matheus Dalenga
 */
package main_while;

import java.util.Scanner;

public class Exc_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pass;
		
		System.out.println("*** Senha ***");
		System.out.println("");
		
		System.out.print("Insira uma senha: ");
		pass = sc.next();
		System.out.println("");
		
		while(!pass.equals("2020")) {
			System.out.print("Senha Inválida, tente novamente: ");
			pass = sc.next();
			System.out.print("");
		}
		
		System.out.println("");
		System.out.println("Senha correta, Acesso permetido!");
		
		sc.close();
	}
}
