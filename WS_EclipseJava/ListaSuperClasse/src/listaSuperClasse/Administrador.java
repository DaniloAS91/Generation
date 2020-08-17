package listaSuperClasse;

public class Administrador extends Pessoa{
	
	double ajudaDeCusto;

	public Administrador(String nome, String end, String tel, double ajudaDeCusto) {
		super(nome, end, tel);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	void imprime() {
		System.out.println();
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}


}
