package aula21_Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(12345678902L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Alex");
		juridica.setCnpj(484805482180000105L);
		
		Pessoa[] ps = new Pessoa[2];
		ps[0] = fisica;
		ps[1] = juridica;
		
		for(Pessoa pessoa:ps ) {
			System.out.println(pessoa.getNome());
			
		}
	}

}
