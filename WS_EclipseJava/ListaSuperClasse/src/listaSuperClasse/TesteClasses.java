package listaSuperClasse;

import java.util.Scanner;

public class TesteClasses {

	public static void main(String[] args) {
		Pessoa ps = new Pessoa(" ", " ", " ");
		Fornecedor fc = new Fornecedor("Marabraz", "7878000101", "455455", 50000, 15000);
		Empregado emp = new Empregado("Carlos", "48585845", "45554555", 48, 15000, 0.45);
		
		Scanner sc = new Scanner(System.in);
		
		// Exercicio 1
		
		System.out.println("Digite seu nome: ");
		ps.setNome(sc.next());
		System.out.println("Endereço: ");
		ps.setEnd(sc.next());
		System.out.println("Telefone: ");
		ps.setTel(sc.next());
		
		ps.imprime();
		
		System.out.println("digite o novo endereço: ");
		ps.altEnd(sc.next());
		
		ps.imprime();
		
		// Exercicio 2 
		
		System.out.printf("\nSaldo: %.2f",fc.obterSaldo(fc.valorCredito, fc.valorDivida));
		
		// Exercicio 3
		
		System.out.printf("\nSalario: %.2f",emp.calcularSalario(emp.salarioBase, emp.imposto));
		
		// Exercicio 4
		
		
		
		sc.close();
		
	}

}
