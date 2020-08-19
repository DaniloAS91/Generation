package ex1_Animais;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 1;
		
		Cachorro ch = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguica pg = new Preguica();
		
		while(op != 0) {
			System.out.println("Digite: "
					+ "\n1 - Cadastrar Cachorro"
					+ "\n2 - Cadastrar Cavalo"
					+ "\n3 - Cadastrar Preguiça"
					+ "\n4 - Imprimir"
					+ "\n0 - Sair");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Nome do Cachorro: ");
					ch.setNome(sc.next());
					System.out.println("Idade do Cachorro: ");
					ch.setIdade(sc.nextInt());
					break;
					
				case 2:
					System.out.println("Nome do Cavalo: ");
					cv.setNome(sc.next());
					System.out.println("Idade do Cavalo: ");
					cv.setIdade(sc.nextInt());
					break;
					
				case 3:
					System.out.println("Nome da Preguiça: ");
					pg.setNome(sc.next());
					System.out.println("Idade do Preguiça: ");
					pg.setIdade(sc.nextInt());
					break;
					
				case 4:
					ch.getDados();
					cv.getDados();
					pg.getDados();
					
					
					break;
					
				case 0:
					System.out.println("Saindo....");
					break;
				default:
					System.out.println("Opção Invalida!!");
				}
			sc.close();
		}
	}
}
