package ex1_CondicaoPagamento;

import java.util.Scanner;

public class CondicaoPagamento {
	
	/*
	 * C�digo Condi��o de pagamento: 
		1 � vista em dinheiro ou cheque, recebe 20% de desconto 
		2 � vista no cart�o de cr�dito, recebe 15% de desconto 
		3 Em duas vezes, pre�o normal de etiqueta sem juros 
		4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		double valor, total;
		
		System.out.println("Valor do Produto da Etiqueta: ");
		valor = sc.nextFloat();
		
		System.out.println("\nCondi��o: \n"
				+ "1 - � vista em dinheiro ou cheque: 20% de desc\n" + 
				  "2 - � vista no cart�o de cr�dito: 15% de desc \r\n" + 
				  "3 - Em 2x, pre�o normal de etiqueta sem juros \r\n" + 
				  "4 - Em 3x, mais juros de 10% \n");
		op = sc.nextInt();
		
		switch(op) {
		
			case 1:
				total = valor - (valor * 0.20);
				System.out.println("Valor a vista ou cheque: "+total);
				
				break;
			
			case 2:
				total = valor - (valor * 0.15);
				System.out.println("Valor no cart�o a vista: "+total);
				
				break;
			
			case 3:
				System.out.printf("\nValor em 2x: %.2f, Cada parcela: %.2f",valor, (valor/2));
				
				break;
			
			case 4:
				total = (valor / 3) * 1.10;
				System.out.printf("\nValor em 3x: %.2f, Cada parcela: %.2f",(total * 3),total);
				
				break;
				
			default:
				System.out.println("Op��o Incorreta!!");
		
		}
		sc.close();
	}

}
