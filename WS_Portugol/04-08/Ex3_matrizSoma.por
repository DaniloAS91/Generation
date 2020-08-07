programa
{
	
	funcao inicio()
	{	
		const inteiro ln = 2, cl = 2;
		inteiro n1, n2, x,y, m1[ln][cl], m2[ln][cl];

	/*	n1 - primeiro elemento de entrada
	 * 	n2 - segundo elemento de entrada
	 * 	m1 - primeira matriz
	 * 	m2 - segunda matriz
	 * 	x - contador de linhas
	 * 	y - contador de colunas
	 */
		para(x = 0; x < ln; x++){
			para(y = 0; y < cl; y++ ){
				escreva("Entre com o elemento N1: ",x+1,",",y+1,": ");
				leia (n1);
				escreva("Entre com o elemento N2: ",x+1,",",y+1,": ");
				leia (n2);

				m1[x][y] = n1 + n2;
				m2[x][y] = n1 - n2;
			}
		}

		escreva("Matriz M1: \n\n");
		para(x = 0; x < ln; x++){
			para(y = 0; y < cl; y++ ){
				escreva("[ ",m1[x][y]," ]");
			}
			escreva("\n");
		}
		escreva("Matriz M2:\n\n");
		
		para(x = 0; x < ln; x++){
			para(y = 0; y < cl; y++ ){
				escreva("[ ",m2[x][y], " ]");
			}
			escreva("\n");
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */