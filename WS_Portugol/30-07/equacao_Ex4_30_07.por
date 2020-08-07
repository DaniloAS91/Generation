programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c, d, r, s; 
		inteiro var = 0;
		
		escreva("Digite o valor de A:");
		leia(a);
		escreva("Digite o valor de B:");
		leia(b);
		escreva("Digite o valor de C:");
		leia(c);
		limpa();
			
		se (a >= 0 e b >= 0 e c >= 0){	
			r = mat.potencia((a+b), 2.0);
			s = mat.potencia((b+c), 2.0);
			d = (r + s)/2;
			
			limpa();
			escreva("A = ", a, "| B = ", b, "| C = ", c, "\n");
			escreva("\nO valor de R é: ", r);
			escreva("\nO valor de S é: ", s);
			escreva("\nO valor de D é: ", d, "\n");
		}
		senao{
			escreva("Não digitar numéros negativos!!!");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */