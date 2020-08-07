programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d;

		escreva("Digite o X1: ");
		leia(x1);
		escreva("Digite o Y1: ");
		leia(y1);
		escreva("Digite o X2: ");
		leia(x2);
		escreva("Digite o Y2: ");
		leia(y2);

		d = (mat.potencia((x2-x1), 2)) + (mat.potencia((y2-y1), 2));
		d = mat.raiz(d, 2);

		escreva("A distacia entre os pontos é: ", d);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */