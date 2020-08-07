programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real num1, num2, res, raiz;

		escreva("Digite num1: ");
		leia(num1);
		limpa();
		escreva("Digite num2: ");
		leia(num2);
		limpa();

		res = num1 * num2;
		raiz = mat.raiz(res, 4);

		escreva("Resultado %i x %i = %i", num1, num2, res, "\n");

		se (res > 15){
			escreva("É maior que 15");
		}
		senao{
			escreva("É menor que 15");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */