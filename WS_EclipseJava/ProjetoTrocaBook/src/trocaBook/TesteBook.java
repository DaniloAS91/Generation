package trocaBook;

import java.util.Scanner;

public class TesteBook {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int op = -1;
		
		while(op != 0) {
			
			System.out.println("Menu:"
					+ "\nEscolha: \n"
					+ "\n1 - Cadastrar Cliente"
					+ "\n2 - Deletar Cliente"
					+ "\n3 - Cadastrar Livro"
					+ "\n4 - Deletrar Livro"
					+ "\n5 - Consultar Livro"
					+ "\n6 - Trocar Livro"
					+ "\n0 - Sair");
			op = sc.nextInt();
			
			switch(op) {
			
			case 1 :
				Cliente cl = new Cliente(null, null,null);
				
				System.out.println("Digite ");
				cl.setNome(sc.next());
				System.out.println();
				cl.setCpf(sc.next());
				System.out.println();
				cl.setEndereco(sc.next());
				
				
				
				break;
				
			case 2 :
				
				break;
				
			case 3 :
				
				break;
				
			case 4 :
				
				break;
				
			case 5 :
				
				break;
				
			case 6 :
				
				break;
				
			case 0 :
				
				break;
				
			default:
				System.out.println("Ops... a mão escorregou... tente novamente!!");
					
			}
			
			
			
		}
		sc.close();
		
	}

}