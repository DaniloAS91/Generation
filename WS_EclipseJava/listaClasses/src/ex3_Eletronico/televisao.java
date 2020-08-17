package ex3_Eletronico;

public class televisao {
	
	private int volumeAtual, canalAtual, statusLig;

	public televisao(int volumeAtual, int canalAtual, int statusLig) {
		this.volumeAtual = volumeAtual;
		this.canalAtual = canalAtual;
		this.statusLig = statusLig;
	}
	
	// Ligando ou Desligando
	
	int liga (int statusLig) {
		if(statusLig == 0 ) {
			System.out.println("Desligando...");
			return 1;
		}
		else {
			System.out.println("Ligando...");
			return 0;
		}
	}
	
	// Mudar Volume
	
	void aumentaVol () {
		if (volumeAtual < 10 && volumeAtual >= 0 && statusLig == 1) { // adiciona 1 a volume se estiver ligada
			volumeAtual = volumeAtual + 1;
			System.out.println("Volume Atual: "+volumeAtual);
		}
		else if(statusLig == 1){
			System.out.println("Volume Maximo!!");
		}
		else {
			System.out.println("Nada Acontece... ops esta Desligado");
		}
	}
	
	void diminuiVol () {
		if (volumeAtual > 0 && volumeAtual <= 10 && statusLig == 1) { // subtrai 1 a volume se estiver ligada
			volumeAtual = volumeAtual - 1;
			System.out.println("Volume Atual: "+volumeAtual);
		}
		else if (statusLig == 1){
			System.out.println("Mudo Ativado!!");
		}
		else {
			System.out.println("Nada Acontece... ops esta Desligado");
		}
	}
	
	// Mudar Canal
	
	void aumentaCanal () {
		if (canalAtual < 20 && canalAtual >= 1 && statusLig == 1) { // Adiciona 1 a canal se estiver ligada
			canalAtual = canalAtual + 1;
			System.out.println("Canal Atual: "+canalAtual);

		}
		else if (statusLig == 1){
			System.out.println("Acabaram os Canais!");
		}
		else {
			System.out.println("Nada Acontece... ops esta Desligado");
		}
	}
	void diminuiCanal () {
		if (canalAtual > 1 && canalAtual <= 20 && statusLig == 1) { // subtrai 1 a canal se estiver ligada
			canalAtual = canalAtual - 1;
			System.out.println("Canal Atual: "+canalAtual);
		}
		else if(statusLig == 1){
			System.out.println("Acabaram os Canais!");
		}
		else {
			System.out.println("Nada Acontece... ops esta Desligado");
		}
	}
	
}
