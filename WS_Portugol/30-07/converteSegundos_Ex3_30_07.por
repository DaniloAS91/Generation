programa
{
	
	funcao inicio()
	{
		inteiro evento;
		inteiro horas, min, seg;

		escreva("Digite o tempo do evento em Segundos: ")
		leia(evento);

		horas = evento / 3600
		min = (evento % 3600) / 60
		seg = (evento % 3600) / 60

		escreva("O evento durou: ", horas, " Horas");
		escreva("\nMinutos: ", min, " Minutos");
		escreva("\nSegundos: ", seg, " Segundos");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */