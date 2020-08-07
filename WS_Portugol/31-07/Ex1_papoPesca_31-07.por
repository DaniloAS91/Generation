programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real p, m, E;

		escreva("Digite o Peso da Mercadoria: ");
		leia(p);

		se(p > 50.0){
			E = p - 50;
			m = E * 4.0;
		}
		senao{
			E = 0.0;
			m = 0.0;
		}
		limpa();
		escreva("\nO Peso da Mercadoria é: ", p);
		escreva("\nA multa é: ", mat.arredondar(m, 2), ", Sobre: ", E, "Kg de Excesso de Peso.");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */