/*
 * author                Matheus Dalenga
 */
package main_for;

import java.util.Scanner;

public class Exc_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_1 = 0;
		int fatorial = 1;
		
		System.out.println("*** FATORIAL ***");
		System.out.println("");
		
		System.out.print("Insira um n�mero que vos� deseja saber o seu fatorial: ");
		num_1 = sc.nextInt();
		
	    for (int i = 2; i <= num_1; i++) {
	    	System.out.println(i);
	        fatorial = fatorial * i;
	    }
	    
		System.out.println("");
		System.out.println("O " + num_1 + "! � " + fatorial);
		
		sc.close();
	}
}
