package listaSuperClasse;

public class Pessoa {
	private String nome;
	private String end; // Endereço
	private String tel; // Telefone
	
	public Pessoa(String nome, String end, String tel) {
		this.nome = nome;
		this.end = end;
		this.tel = tel;
				
	}
	
	String altEnd(String end) {
		this.end = end;
		System.out.println("Endereço Alterado!\n");
		return end;
	
	}
	
	void imprime() {
		System.out.println("Nome: "+nome+
				"\nEnd.: "+end+
				"\nTel.: "+tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
