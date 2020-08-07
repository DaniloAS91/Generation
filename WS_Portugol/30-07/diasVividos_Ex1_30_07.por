programa
{
	inclua biblioteca Calendario --> cal
	
	funcao inicio()
	{
		inteiro diaP, mesP, anoP; // dados da pessoa
		inteiro diaHj, mesHj, anoHj, tempVida; // data atual
		diaHj = cal.dia_mes_atual();
		mesHj = cal.mes_atual();
		anoHj = cal.ano_atual();
		
		escreva("Digite seu Dia de Nascimento: ");
		leia(diaP);
		escreva("Digite seu mes de Nascimento: ");
		leia(mesP);
		escreva("Digite seu ano de Nascimento: ");
		leia(anoP);

		tempVida = (anoHj - anoP)*365);
		tempVida = (tempVida - diaP) - (mesP * 30);
		tempVida = tempVida + (mesHj * 30) + diaHj;


		
		escreva("\nVocê viveu: ", tempVida, " em Dias até Hoje!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */