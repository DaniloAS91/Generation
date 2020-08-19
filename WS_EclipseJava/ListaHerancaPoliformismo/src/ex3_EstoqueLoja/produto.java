package ex3_EstoqueLoja;

public class produto {
	private String nome;
	private int cod;
	private int qtde;
	
	public produto(String nome, int cod, int qtde) {
		this.nome = nome;
		this.cod = cod;
		this.qtde = qtde;
	}


	
	// Getter and Setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
}
