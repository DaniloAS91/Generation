package DoisPontos;

import java.util.Scanner;

public class pgDoisPontos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite o valor de X1: ");
		x1 = sc.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = sc.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = sc.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = sc.nextDouble();
		
		d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		
		System.out.println("\nA distancia entre os dois pontos �: "+ d);
		sc.close();
	}

}
