package testeCarro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro car = new Carro();
		car.cor = "azul";
		car.modelo = "palio";
		car.velocidadeAtual = 0;
		car.velocidadeMaxima = 150;
		
		car.liga();
		car.acelera(35);
		System.out.println(car.velocidadeAtual);
		
		car.marchaAtual();

	}

}
