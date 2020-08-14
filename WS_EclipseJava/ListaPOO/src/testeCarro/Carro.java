package testeCarro;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() {
		System.out.println("O Carro esta Ligado!");
	}
	
	void acelera(double qtde) {
		double novaVelocidade = this.velocidadeAtual + qtde;
		this.velocidadeAtual = novaVelocidade;
	}
	
	int marchaAtual() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
