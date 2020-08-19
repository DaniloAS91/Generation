package ex1_Animais;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public abstract String emiteSom();
	
	public abstract String fazAcao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(final int idade) {
		this.idade = idade;
	}	

}
