programa
{
	
	funcao inicio()
	{
		real ind;
		
		escreva("Digite o indice de Poluição: ");
		leia(ind);

		se (ind >= 0.05 e ind <= 0.25){
			escreva("O indice de Poluição esta Aceitavél!!");
		}
		senao se (ind >= 0.26 e ind < 0.3){
			escreva("O indice de Poluição esta Elevado!!");
		}
		senao se (ind >= 0.3 e ind < 0.4){
			escreva("Suspender Industrias de 1º Grupo!!");
		}
		senao se (ind >= 0.4 e ind < 0.5){
			escreva("Suspender Industrias de 1º e 2º Grupo");
		}
		senao se (ind >= 0.5){
			escreva("Suspender Industrias de Todos os Grupos");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */