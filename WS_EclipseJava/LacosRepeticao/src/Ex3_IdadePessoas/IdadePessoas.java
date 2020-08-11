package Ex3_IdadePessoas;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, cont21 = 0, cont50 = 0;
		
		while(idade != -99) {
			
			System.out.println("Digite a  sua Idade: ");
			idade = sc.nextInt();
			
			if (idade > 0 && idade < 21) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
			
		}
		
		System.out.println("Qtde Pessoas Abaixo de 21 anos: "+cont21);
		System.out.println("Qtde Pessoas Acima de 50 anos: "+cont50);
		sc.close();
	}

}
