package Ex4_PesqIndividuosV2;

import java.util.Scanner;

public class PesqIndividuosV2 {

	public static void main(String[] args) {
		
		 /*
		 Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		 psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		 era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		 (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		 agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		 pessoas, calcule e mostre: (WHILE)
		 o n�mero de pessoas calmas; ok
		 o n�mero de mulheres nervosas;ok
		 o n�mero de homens agressivos; ok
		 o n�mero de outros calmos; ok
		 o n�mero de pessoas nervosas com mais de 40 anos;ok
		 o n�mero de pessoas calmas com menos de 18 anos. ok
		 */
	
	
	Scanner sc = new Scanner(System.in);
	
	int idade = -99, estado= 0, pCalmas= 0, mNervosa= 0, homensAgr= 0, outrosC= 0, nervoso40= 0, calmos18= 0;
	char  sexo = ' ', op = 's';
	
	while(op == 's' || op == 'S') {
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Informe: \nF - Feminino \nM - Masculino \nO - Outros");
		 sexo = sc.next().charAt(0);
		System.out.println("Informe: \n1 - Calmo(a) \n2 - Nervoso(a) \n3 - Agressivo(a)");
		estado = sc.nextInt();
		
		if (estado == 1) { // Calmos
			pCalmas++; // Conta Qtde Pessoas Calmas
			
			if(sexo == 'o' || sexo == 'O') {
				outrosC++; // Conta Qtde Outros Calmos
			}
			if(idade > 0 && idade < 18) {
				calmos18++; // Conta Qtde de Calmos Menores de 18 anos
			}
		}
		
		else if (estado == 2) { // Nervosos
			if(sexo == 'f' || sexo == 'F' ) {
				mNervosa++; // Conta Qtde de Mulheres Nervosas
			}
			if(idade > 40) {
				nervoso40++; // Conts Qtde de nervosos Acima dos 40
			}
		}
		
		else if (estado == 3 && (sexo == 'm'|| sexo == 'M')) { // Agressivos
			homensAgr++; // Conta Qtde de Homens Agressivos
		}
		
		System.out.println("Deseja Continuar??(S/N)");
		op = sc.next().charAt(0);
		
	}
	
	System.out.println("-- Informa��es Pesquisa -- ");
	System.out.println("N�mero de pessoas calmas: "+pCalmas);
	System.out.println("N�mero de mulheres nervosas: "+mNervosa);
	System.out.println("N�mero de homens agressivos: "+homensAgr);
	System.out.println("N�mero de outros calmos: "+outrosC);
	System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+nervoso40);
	System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+calmos18);
	
	sc.close();

}
	
}
