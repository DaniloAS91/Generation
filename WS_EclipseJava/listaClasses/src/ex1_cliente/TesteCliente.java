package ex1_cliente;

import java.util.Scanner;

public abstract class TesteCliente {

	public static void main(String[] args) {
		int cod = 0, cpf = 0;
		String nome = null, sobrenome = null;
		
		Cliente cl = new Cliente(cpf, cod, nome, sobrenome);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n\nDigite o nome do cliente: ");
		cl.setPrimeiroNome(nome = sc.next());
		System.out.println("Digite o Sobrenome do Cliente: ");
		cl.setSobrenome(sobrenome = sc.next());
		System.out.println("Digite o CPF do Cliente: ");
		cl.setCpf(cpf = sc.nextInt());
		System.out.println("Digite o Código do Cliente: ");
		cl.setCod(cod = sc.nextInt());
		
		
		System.out.println("Cliente: "+ cl.nomeCompleto());
		System.out.println("CPF: "+ cl.getCpf());
		System.out.println("Código: "+ cl.getCod());
		
		sc.close();

	}

}
