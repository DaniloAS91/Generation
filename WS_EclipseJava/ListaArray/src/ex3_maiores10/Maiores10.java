package ex3_maiores10;

import java.util.Scanner;

public class Maiores10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[2][2];
		int x, y, m10 = 0;
		
		System.out.println("Digite os numeros da matriz: ");
		for (x=0; x < 2; x++) {
			for (y=0; y < 2; y++) {
				System.out.printf("Nº %dx%d: ", x+1 ,y+1);
				matriz[x][y] = sc.nextInt();
				
				if(matriz[x][y] > 10) {
					m10++;
				}
			}
		}
		
		System.out.println("\nQtde de numeros maiores que 10: "+m10);
		
		for (x=0; x < 2; x++) {
			for (y=0; y < 2; y++) {
				System.out.printf("%d ",matriz[x][y]);
			}
			System.out.printf("\n");
		}
		
		sc.close();
	}

}
