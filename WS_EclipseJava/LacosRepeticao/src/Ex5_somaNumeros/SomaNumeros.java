package Ex5_somaNumeros;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int num,soma=0;
		
		do {
			System.out.println("Digite os numeros");
			num = sc.nextInt();
			
			soma = soma + num;
			
		}
		while(num !=0);
		
		System.out.println(" A soma dos numeros é" + soma);
		sc.close();
	}
}
