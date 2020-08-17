package ex3_Eletronico;

import java.util.Scanner;

public class ControleTV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int status = 1, vol = 0, canal = 1;
		
		televisao tv = new televisao(vol, canal, status);
		
		int op = 1;
		
		do {
			System.out.println("Escolha uma Função: "
					+ "\n1 - Liga / Desliga	TV"
					+ "\n2 - Aumenta Volume "
					+ "\n3 - Diminui Volume "
					+ "\n4 - Muda Canal + "
					+ "\n5 - Muda Canal - "
					+ "\n0 - Sair \n");
			op = sc.nextInt();
			
			switch(op) {
				
				case 1:
					status = tv.liga(status);
					
					break;
					
				case 2:
					tv.aumentaVol();
					
					break;
					
				case 3:
					tv.diminuiVol();
					
					break;
					
				case 4:
					tv.aumentaCanal();
					
					break;
					
				case 5:
					tv.diminuiCanal();
					
					break;
					
				case 0:
					System.out.println("Saindo....");
					break;
					
				default:
					System.out.println("Nada Acontece??");
					
			}
		}
		while(op != 0);
		
		sc.close();
	}

}
