package Ex1_IntervaloPor11;

public class IntervaloPor11 {

	public static void main(String[] args) {
		
		int i;
		
		System.out.printf("Os numeros são: ");
		for (i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.printf("%d ", i);
			}
		}
	}

}
