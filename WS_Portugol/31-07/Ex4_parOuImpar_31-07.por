programa
{
	
	funcao inicio()
	{
		inteiro n;
		
		escreva("Digite um Número: ");
		leia(n);

		se (n != 0){
			se(n % 2 == 0){
				se(n > 0){
					escreva("Este numero é Par e Positivo");
				}
				senao{
					escreva("Este numero é Par e Negativo");
				}
				
			}
			senao{
				se(n > 0){
					escreva("Este numero é Ímpar e Positivo");
				}
				senao{
					escreva("Este numero é Ímpar e Negativo");
				}		
			}
		}
		senao{
			escreva("Este numero é 0");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */