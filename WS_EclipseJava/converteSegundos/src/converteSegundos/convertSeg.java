package converteSegundos;

import java.util.Scanner;

public class convertSeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evento, hora, min, seg;
		
		System.out.println("Digite o tempo do Evento em Segundos:  ");
		evento = sc.nextInt();
		
		hora = (evento / 3600);
		min = (evento % 3600) / 60;
		seg = (evento % 3600) % 60;
		
		System.out.println("Em horas: "+ hora);
		System.out.println("minutos: "+ min);
		System.out.println("segundos: "+ seg);
		
		sc.close();
	}

}
