package ex6_vetorEmatriz;

import java.util.Scanner;

public class VetorEmatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int cl = 2, ln = 2;
		int vetor[] = new int[cl];
		int m1[][] = new int[ln][cl];
		int x,y;
		
		System.out.println("Digite os valores do vetor: ");
		for(x = 0; x < ln; x++) {
			System.out.printf("N%d: ", x+1);
			vetor[x] = sc.nextInt();
		}
		
		
		System.out.println("\nDigite os valores da matriz: ");
		for (x = 0; x < ln; x++) {
			for(y = 0; y < cl; y++) {
				System.out.printf("Nº %dx%d: ", x+1,y+1);
				m1[x][y] = sc.nextInt();
			}
		}
		
		for (x = 0; x < ln; x++) {
			for(y = 0; y < cl; y++) {
				m1[x][y] = vetor[y] * m1[x][y];	
			}
		}
		
		System.out.println("\nVetor x Matriz: ");
		for (x = 0; x < ln; x++) {
			for(y = 0; y < cl; y++) {
				System.out.printf("%d ", m1[x][y]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
