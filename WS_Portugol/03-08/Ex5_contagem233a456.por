programa
{
	
	funcao inicio()
	{
		inteiro n = 230;
		faca{
			se(n > 300 e n < 400){	
				faca{
					n = n + 5;
					escreva (n, " ");
				}
				enquanto(n > 300 e n < 400);
			}
			
			n = n + 3;
			escreva (n, " ");
		}
		enquanto(n > 230 e n < 456);
	}
}

/* Outro jeito Cezar Fez:
 *  
 *  programa
{
	
	funcao inicio()
	{

		inteiro cont = 233
		escreva ("Contagem: ");
		
		faca{
			
			se((cont>=300) e (cont<=400)){

			 	cont = cont + 5
				escreva(cont," ");
			}senao{
		
				cont = cont + 3
				escreva(cont," ");
			}
			
		}enquanto(cont < 456)
			//escreva(" contador", cont+1)
	}
		
}
 *  
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */