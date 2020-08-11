package Ex2_numParesImpares;

import java.util.Scanner;

public class NumParesImpares {
	
	/*
	 * 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, num, nPar = 0, nImpar = 0;
		
		for (i = 0; i < 3; i++) {
			
			System.out.printf("Digite o %dº numero: ", i+1);
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				nPar++;
			}
			else {
				nImpar++;
			}
			
		}
		System.out.println("Numero de Pares: "+nPar);
		System.out.println("Numero de Impares: "+nImpar);
		sc.close();
	}

}
