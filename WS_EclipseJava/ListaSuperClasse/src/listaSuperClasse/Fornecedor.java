package listaSuperClasse;

public class Fornecedor extends Pessoa{
	double valorCredito;
	double valorDivida;
	
	public Fornecedor (String nome, String end, String tel, double valorCredito, double valorDivida){
		super(nome, end, tel);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	double obterSaldo(double valorCredito, double valorDivida) {
		return valorCredito - valorDivida;
		
	}

}
