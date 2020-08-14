package teste;

public class TestePessoa {
	private int cpf;
	private String primeiroNome;
	private String sobrenome;
	
	public TestePessoa (int cpf, String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + sobrenome;
		return nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
