package equacaoEx4;

import java.util.Scanner;

public class equacao {
	public static void main(String[] args) {
		
		/*
		 * 4. Escreva  um sistema que leia tr�s n�meros
		 *  inteiros e positivos (A, B, C)
		 *  e calcule a seguinte express�o:   
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		double R, S;
		
		System.out.println("Entre com A: ");
		A = sc.nextInt();		
		System.out.println("Entre com B: ");
		B = sc.nextInt();	
		System.out.println("Entre com C: ");
		C = sc.nextInt();
		
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		
		D = (int) (R + S)/2;
		
		System.out.printf("A resposta �: %d ", D);
		
		sc.close();
	}

}
