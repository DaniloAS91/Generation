package ex3_EstoqueLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testeLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <produto> listaProd = new ArrayList<produto>();
		produto pd = new produto(null,0, 0);
		
		int op = -1, busca;;
		
		while(op != 0) {
			System.out.println("Escolha: "
					+ "\n1 - Cadastrar Produto"
					+ "\n2 - Remover Produto"
					+ "\n3 - Atualizar Produto"
					+ "\n4 - Imprimir Produtos"
					+ "\n0 - Sair");
			op = sc.nextInt();
			
			switch(op) {
				
			case 1:
				
				System.out.println("Digite o nome do Produto: ");
				pd.setNome(sc.next());
				System.out.println("Digite o Código do Produto:");
				pd.setCod(sc.nextInt());
				System.out.println("Digite a Qtde: ");
				pd.setQtde(sc.nextInt());
				
				if (listaProd.isEmpty()) {
					listaProd.add(pd);
					
				}
				else if (listaProd.contains(pd.getCod())) {
					System.out.println("Produto Ja cadastrado"
							+ "\n\n Somando Quantidade!");
					
					for (produto p: listaProd) {
						if (p.getCod() == pd.getQtde()) {
							p.setQtde(p.getQtde()+pd.getQtde());
						}
					}
					
				}
				
				break;
				
			case 2:
				
				System.out.println("Digite o Código: ");
				busca = sc.nextInt();
				
				if (listaProd.isEmpty()) {
					System.out.println("Lista Vazia!!");
				}
				else {
					
					for (produto p: listaProd) {
						if (p.getCod() == busca) {
							listaProd.remove(p);
							System.out.println("Produto Removido!!");
						}
					}
					
				}
				
				break;
				
			case 3:

				System.out.println("Digite o Código: ");
				busca = sc.nextInt();
				
				if (listaProd.isEmpty()) {
					System.out.println("Lista Vazia!!");
				}
				else {
					
					for (produto p: listaProd) {
						if (p.getCod() == busca) {
							System.out.println("Digite o nome do Produto: ");
							pd.setNome(sc.next());
							System.out.println("Digite a Qtde: ");
							pd.setQtde(sc.nextInt());
						}
					}	
				}
				
				break;
				
			case 4:
				for(produto p: listaProd) {
					System.out.println("\nProduto: "+p.getNome());
					System.out.println("\nCódigo: "+p.getCod());
					System.out.println("\nQtde: "+p.getQtde());
				}
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção Invalida!!");
			
			
			}
		}
		sc.close();
		
		
		
		
	}

}
