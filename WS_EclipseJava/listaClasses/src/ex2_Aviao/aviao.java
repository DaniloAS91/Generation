package ex2_Aviao;

public class aviao {
	private int cod;
	private String destino;
	private String partida;
	private int qtdePessoas;
	
	public aviao (int cod, String destino, String partida, int qtdePessoas) {
		this.cod = cod;
		this.destino = destino;
		this.partida = partida;
		this.qtdePessoas = qtdePessoas;
	}
	
	boolean statusQtde (int qtdePessoas) {
		if (qtdePessoas <= 50) {
			System.out.println("Qtde Pessoas [OK]");
			return true;
		}
		else {
			System.out.println("Qtde Pessoas [FAIL]");
			return false;
		}
	}
	
	boolean cintoPassageiro (char cinto) {
		if (cinto == 's' || cinto == 'S') {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	void decolar(boolean statusCinto, int qtdePessoas) {
		
		if (statusCinto == true) {
			System.out.println("\nCintos [OK]");
		}
		else {
			System.out.println("\nCintos [FAIL]");
		}
		
		if( statusQtde(qtdePessoas) == true && statusCinto == true) {
			System.out.println("Decolando...3 2 1...");
		}
		else {
			System.out.println("Decolagem Abortada!!");
		}
	}
	
	void infoVoo () {
		System.out.println("\nDestino: "+destino);
		System.out.println("Local de Partida: "+partida);
		System.out.println("Código: "+cod);

	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public int getQtdePessoas() {
		return qtdePessoas;
	}

	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}
	
	
	
}
