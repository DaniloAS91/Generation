package ex4_somaFor;

public class SomaFor {

	public static void main(String[] args) {
		int x = 1, y = 1, soma = 0;
		
		for(x = 1; x <= 50; x++) {
			
			soma = soma + (y/x);
			System.out.printf("\nSoma = %d + %d)",y,x);
			y += 2;
		}
		
		System.out.printf("Soma Total: %.1f",soma);
	}

}
