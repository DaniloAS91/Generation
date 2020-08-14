package ex5_vetor5;

import java.util.Scanner;

public class Vetor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[5];
		int i,op;
		
		System.out.println("Digite os Valores do vetor: ");
		for(i = 0; i < vetor.length; i++) {
			System.out.printf("\nN%d: ",i+1);
			vetor[i] = sc.nextDouble();
		}
		
		do {
			System.out.println("\nEscolha: "
					+ "\n1 - Mostre o vetor na ordem direta "
					+ "\n2 - Mostre o vetor na ordem inversa "
					+ "\n9 - Sair");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("\nOrdem Direta: ");
					for(i = 0; i < vetor.length; i++) {
						System.out.printf("%.1f ",vetor[i]);
					}
					
					break;
					
				case 2: 
					System.out.println("\nOrdem Inversa: ");
					for(i = vetor.length -1; i >= 0; i--) {
						System.out.printf("%.1f ",vetor[i]);
					}
					
					break;
					
				case 9: 
					System.out.println("Saindo...");
					
					break;
					
				default:
					System.out.println("Código Invalido: ");
					
			}
			
			
		}
		while(op != 9);
		sc.close();
		
	}

}
