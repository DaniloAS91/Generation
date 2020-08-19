package trocaBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciaLivros{
	
	private List <Cliente> listaCliente = new ArrayList();
	private List <Livro> listaLivros = new ArrayList();
	private List <Integer> listaDadosTroca = new ArrayList<Integer>();
	
	
	public void cadastraLivro(Livro l) {
		listaLivros.add(l);
		
	}
	
	public void removeLivro(Livro l) {
		listaLivros.remove(l);
	}
	
	public void cadastraCliente(Cliente c) {
		listaCliente.add(c);
		
	}
	
	public void removeCliente(Cliente c) {
		listaCliente.add(c);
	}
	
	public void consultaLivro() {
		
	}
	
	public void trocaLivro() {
		
	}
}
