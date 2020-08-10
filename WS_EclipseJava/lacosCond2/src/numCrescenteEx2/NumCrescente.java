package numCrescenteEx2;

import java.util.Scanner;

public class NumCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Num 1:");
		n1 = sc.nextInt();
		System.out.println("Num 2:");
		n2 = sc.nextInt();
		System.out.println("Num 3:");
		n3 = sc.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			System.out.printf("Ordem: %d",n1);
			if(n2 <= n3) {
				System.out.printf(", %d, %d.",n2,n3);
			}
			else {
				System.out.printf(", %d, %d.",n3,n2);
			}
		}
		
		else if (n2 <= n1 && n2 <= n3) {
			System.out.printf("Ordem: %d",n2);
			if(n1 <= n3) {
				System.out.printf(", %d, %d.",n1,n3);
			}
			else {
				System.out.printf(", %d, %d.",n3,n1);
			}
		}
		
		else {
			System.out.printf("Ordem: %d",n3);
			if(n1 <= n2) {
				System.out.printf(", %d, %d.",n1,n2);
			}
			else {
				System.out.printf(", %d, %d.",n2,n1);
			}
		}
			
		sc.close();
		
	}
}
