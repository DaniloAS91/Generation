package teste;

public class Nome {

	public static void main(String[] args) {
		TestePessoa ps = new TestePessoa(12345, "Marcos", "Antonio");
		
		System.out.println(ps.getNomeCompleto());
		System.out.println(ps.getCpf());
	}

}
