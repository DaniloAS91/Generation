package ex1_Animais;

public class Cavalo extends Animal{
	
	public Cavalo() {
		super();
	}
	
	public String emiteSom() {
		return " Late";
	}
	
	public String fazAcao() {
		return " Correr";
	}
	
	public String getDados() {
		return "Animal: Cachorro - Nome: "+super.getNome()+
				" - Idade: "+super.getIdade()+"\nSom: "+this.emiteSom()+" - Caracteristica: "+this.fazAcao();
	}
	
}
