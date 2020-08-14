package ex3_contaIntervalo;

import java.util.Scanner;

public class ContaIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont0a25=0, cont26a50=0, cont51a75=0, cont76a100=0;
		int num;
		
		do {
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
			
			if(num >= 0 && num <= 25) {
				cont0a25++;
			}
			else if(num >= 26 && num <= 50) {
				cont26a50++;
			}
			else if(num >= 51 && num <= 75) {
				cont51a75++;
			}
			else if(num >= 76 && num <= 100) {
				cont76a100++;
			}
		}
		while (num > 0);
		
		System.out.println("\nQtde numeros 0 a 25: "+ cont0a25);
		System.out.println("Qtde numeros 26 a 50: "+ cont26a50);
		System.out.println("Qtde numeros 51 a 75: "+ cont51a75);
		System.out.println("Qtde numeros 76 a 100: "+ cont76a100);
		
		sc.close();
	}

}
