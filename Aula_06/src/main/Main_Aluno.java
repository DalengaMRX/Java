package main;

import java.util.Locale;
import java.util.Scanner;


import classes.Aluno;

public class Main_Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Informa as suas 3 notas: ");
		aluno.nota_1 = sc.nextDouble();
		aluno.nota_2 = sc.nextDouble();
		aluno.nota_3 = sc.nextDouble();
		
		System.out.printf("A Nota final é: %.2f%n", aluno.notaFinal());
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO !!");
			System.out.printf("Faltou %.2f pontos para ser aprovado!!", aluno.diferenca());
		} else {
			System.out.println("APROVADO!!!");
		}
		
		sc.close();

	}

}
