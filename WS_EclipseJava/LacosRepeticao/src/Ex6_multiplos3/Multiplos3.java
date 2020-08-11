package Ex6_multiplos3;

import java.util.Scanner;

public class Multiplos3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, soma=0,cont=0;
		
		do {
			
			System.out.println("Digite os numeros");
			num = sc.nextInt();
			
			
			if (num % 3== 0 && num!= 0) {
				cont++;
				
				soma = soma + num;
				
			}
		}
		
		while(num !=0);
		
		soma = soma/cont;
		
		System.out.println(soma);
		System.out.println("Contador" +cont);
		
		sc.close();
	}
	
}
