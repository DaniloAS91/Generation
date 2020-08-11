package mediaAlunoEx5;

import java.util.Scanner;

public class mediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double notaA, notaB, notaC, media;
		@SuppressWarnings("unused")
		String nome;
		
		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Digite a nota A: ");
		notaA = sc.nextDouble();
		System.out.println("Digite a nota B: ");
		notaB = sc.nextDouble();
		System.out.println("Digite a nota C: ");
		notaC = sc.nextDouble();
		
		media = (notaA * 0.2) + (notaB * 0.3) + (notaC * 0.5);
		
		System.out.println("Nota A é : " + notaA+" Nota é : " + notaB + " Nota C é : " + notaC);
		System.out.println("A media do aluno é : " + media);
		
		sc.close();
				
		
				
				
		

	}

}