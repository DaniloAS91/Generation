programa
{
	funcao inicio()
	{
		/*
		 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * 	e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 *	ou seja, diagonal principal.
		 */
		const inteiro ln = 3, cl = 3;
		inteiro x, y, m1[ln][cl], somaNum = 0, diagSoma = 0;

		para(x = 0; x < ln; x++){
			para(y = 0; y < cl; y++){
				escreva("Digite o elemento: ",x,",",y," :" );
				leia(m1[x][y]);

				somaNum = somaNum + m1[x][y];
				se (x == y){
					diagSoma = diagSoma + m1[x][y];
				}
			}
		}

		escreva("Matriz: \n");
		para(x = 0; x < ln; x++){
			para(y = 0; y < cl; y++){
				escreva("[ ",m1[x][y]," ]");
			}
			escreva("\n");
		}
		escreva("\nSoma dos Números da Matriz é: ",somaNum);
		escreva("\nSoma da diagonal Principal: ", diagSoma);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 833; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */