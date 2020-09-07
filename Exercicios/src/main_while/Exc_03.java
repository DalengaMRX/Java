/*
 * author                Matheus Dalenga
 */
package main_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String opc = "";
				
		List<String> lista_pedidos = new ArrayList<String>();
		
		System.out.println("*** Caixa ***");
		
		System.out.print("\n");
		
		while(!opc.equals("4")) {
			
			System.out.println("");
			
			System.out.println("| COD || COMBUSTÍVEL |");
			System.out.println("|  1  ||    Alcool   |");
			System.out.println("|  2  ||   Gasolina  |");
			System.out.println("|  3  ||    Dísel    |");
			System.out.println("|  4  || *FINALIZAR* |");
			
			System.out.println("");
			
			System.out.print("Escolha alguns dos produtos acima: ");
		
			System.out.print("");
			
			opc = sc.next();
			
			if(opc.equals("1")) {
				lista_pedidos.add("1 - Alcool");
				
			}
			
			else if(opc.equals("2")) {
				lista_pedidos.add("2 - Gasolina");
			}
			
			else if(opc.equals("3")) {
				lista_pedidos.add("3 - Dísel");
			}
			
		}
		System.out.println("");
		
		System.out.println("Pedido Finalizado: \n");
		
		for(int i = 0; i < lista_pedidos.size(); i++){
			System.out.println(lista_pedidos.get(i));
		}
		

		sc.close();
	}
}
