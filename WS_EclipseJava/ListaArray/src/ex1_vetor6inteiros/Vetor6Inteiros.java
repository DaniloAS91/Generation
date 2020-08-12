package ex1_vetor6inteiros;

import java.util.Scanner;

public class Vetor6Inteiros {
	
	/*
	 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
	inteiros. O programa deve executar os seguintes passos:
	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	
	(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
	A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
	
	(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
	
	(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[6];// T�pico A: Inserir vetor: 1, 0, 5, -2, -5, 7.
		int soma = 0;
		
		System.out.println("Digite os valores do vetor A: ");
		
		for(int i = 0; i < A.length; i++) {
			System.out.printf("N%d: ",i+1);
			A[i] = sc.nextInt();
		}
		
		soma = A[0]+A[1]+A[5]; // T�pico B: OK
		
		A[3] = 100; // T�pico C: OK
		
		System.out.println("A soma das posi��es 0,1 e 5 �: "+soma);
		
		System.out.println("Valores do vetor A: "); // Topico D: OK
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
		sc.close();
	}

}
