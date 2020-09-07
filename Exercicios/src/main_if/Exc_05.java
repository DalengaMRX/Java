/*
 * author                Matheus Dalenga
 */
package main_if;

import java.util.Scanner;

public class Exc_05 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = 0; 
		int quantidade = 0;
		
		System.out.println("*** Caixa de mercado ***\n");
		
		System.out.println("|   COD  ||  QTD  |");
		System.out.println("|C�digo 1||  X4   |");
		System.out.println("|C�digo 2||  X4.5 |");
		System.out.println("|C�digo 3||  X5   |");
		System.out.println("|C�digo 4||  x2   |\n");
		
		System.out.print("Informe o c�digo desejado: ");
		cod = sc.nextInt();
		
		
		System.out.print("Informe a quantidade do produto: ");
		quantidade = sc.nextInt();
			
		switch(cod) {
			case 1:
				System.out.println("O produto de c�digo 1 deu um total de " + ((float)(quantidade * 4) + " quantidades"));
				break;
				
			case 2:
				System.out.println("O produto de c�digo 2 deu um total de " + ((float)(quantidade * 4.5) + " quantidades"));
				break;
				
			case 3:
				System.out.println("O produto de c�digo 3 deu um total de " + ((float)(quantidade * 5) + " quantidades"));
				break;
				
			case 4:
				System.out.println("O produto de c�digo 4 deu um total de " + ((float)(quantidade * 2) + " quantidades"));
				break;
				
			default:
				System.out.println("O c�digo digitado n�o existe\n");
				System.out.println("O produto de c�digo "+ cod + " foi calculado com X1.5, o total foi de " + ((float)(quantidade * 1.5)));
		}
		
		sc.close();
	}
}
