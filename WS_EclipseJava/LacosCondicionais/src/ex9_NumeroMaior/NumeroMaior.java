package ex9_NumeroMaior;

import java.util.Scanner;

public class NumeroMaior {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		}
		else if (n2 >= n1 && n2 >= n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		
		System.out.printf("O maior número é: %d", maior);
		sc.close();
	}

}
