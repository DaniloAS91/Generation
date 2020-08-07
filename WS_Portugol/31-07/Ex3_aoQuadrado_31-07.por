programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real n1, n2, n3, n4;
		
		escreva("Digite o N1: ");
		leia(n1);
		escreva("Digite o N2: ");
		leia(n2);
		escreva("Digite o N3: ");
		leia(n3);
		escreva("Digite o N4: ");
		leia(n4);

		se (mat.raiz(n3, 2.0) >= 1000){
			escreva("A raiz de N3 é: ", mat.raiz(n3, 2.0));
		}
		senao{
			limpa();
			escreva("\nA raiz de N1 é: ", mat.raiz(n1, 2.0));
			escreva("\nA raiz de N2 é: ", mat.raiz(n2, 2.0));
			escreva("\nA raiz de N3 é: ", mat.raiz(n3, 2.0));
			escreva("\nA raiz de N4 é: ", mat.raiz(n4, 2.0));
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */