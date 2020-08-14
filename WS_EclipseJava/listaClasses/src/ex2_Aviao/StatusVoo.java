package ex2_Aviao;

import java.util.Scanner;

public class StatusVoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = 0, qtdePessoas = 0;
		String destino = null, partida = null;
		char cinto = ' ';
		boolean statusCinto;
		
		aviao av = new aviao(cod, destino, partida, qtdePessoas);
		
		System.out.println("Informe o Código: ");
		av.setCod(cod = sc.nextInt());
		System.out.println("Informe o Local de Partida: ");
		av.setPartida(partida = sc.next());
		System.out.println("Informe o Destino: ");
		av.setDestino(destino = sc.next());
		System.out.println("Informe a Qtde de Pessoas no avião: ");
		av.setQtdePessoas(qtdePessoas = sc.nextInt());
		System.out.println("Todos com cinto: (S/N)");
		cinto = sc.next().charAt(0);
		
		statusCinto = av.cintoPassageiro(cinto);
		av.infoVoo();
		av.decolar(statusCinto, qtdePessoas);
		
		
		sc.close();
		
		
	}

}
