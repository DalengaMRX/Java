package main;

import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;

public class Main_Funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		func.salario_bruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: " + func);
		
		System.out.print("Informe o percentual de incremento: ");
		double percentual = sc.nextDouble();
		
		func.acrescimo_salario(percentual);
		
		System.out.println("Dados atualiados: " + func);
		
		sc.close();

	}

}
