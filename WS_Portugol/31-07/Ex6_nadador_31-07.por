programa
{
	
	funcao inicio()
	{	
		inteiro idade;
		
		escreva("Informe a Idade do Nadador:");
		leia(idade);
		/*
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		*/

		se (idade < 5){
			escreva("Não Classificado!!");
		}
		senao se (idade >= 5 e idade <= 7){
			escreva("Classificado como Infantil A!!");
		}
		senao se (idade >= 8 e idade <= 11){
			escreva("Classificado como Infantil B!!");
		}
		senao se (idade >= 12 e idade <= 13){
			escreva("Classificado como Juvenil A!!");
		}
		senao se (idade >= 14 e idade <= 17){
			escreva("Classificado como Juvenil B!!");
		}
		senao{
			escreva("Classificado como Adulto!!");
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 731; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */