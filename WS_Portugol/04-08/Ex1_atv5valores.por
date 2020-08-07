programa
{
	
	funcao inicio()
	{
		const inteiro qtde = 5;
		inteiro vetor[qtde], maior = 0, i;

		para (i=0; i < qtde; i++){
			escreva ("Digite o ",i+1," número: ");
			leia(vetor[i]);

			se (maior < vetor[i]){
				maior = (vetor[i]);
			}
		}
		
		para (i=0; i < qtde; i++){
			escreva ("[ ", vetor[i], " ] ");
		}
		escreva("\nO numero maior é: ", maior);
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */