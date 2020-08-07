package converteIdadeEx1;

import java.util.Scanner;

public class converteIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int diaP, mesP, anoP, tempo;
		
		System.out.println("Digite sua idade em dias: ");
		tempo = sc.nextInt();
		
		anoP = (tempo / 365);
		mesP = (tempo % 365) / 30;
		diaP = (tempo % 365) % 30;
		
		System.out.println("Anos: "+ anoP);
		System.out.println("Meses: "+ mesP);
		System.out.println("Dias: "+ diaP);
		
		sc.close();
	}

}
