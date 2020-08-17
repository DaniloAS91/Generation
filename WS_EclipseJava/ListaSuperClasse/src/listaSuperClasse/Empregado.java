package listaSuperClasse;

public class Empregado extends Pessoa{
	int codigoSetor;
	double salarioBase;
	double imposto;
	
	public Empregado (String nome, String end, String tel, int codigoSetor, double salarioBase, double imposto) {
		super (nome, end, tel);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	double calcularSalario (double salarioBase, double imposto) {
		return salarioBase - (salarioBase * imposto);
	}
	
	
	
}
