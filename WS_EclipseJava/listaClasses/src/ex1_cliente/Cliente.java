package ex1_cliente;

public class Cliente {
	int cpf;
	int cod;
	String primeiroNome;
	String sobrenome;
	
	public Cliente(int cpf, int cod, String primeiroNome, String sobrenome) {
		this.cpf = cpf;
		this.cod = cod;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		
	}
	
	public String nomeCompleto() {
		String nomeCompleto;
		nomeCompleto = primeiroNome + " " + sobrenome;
		return nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
