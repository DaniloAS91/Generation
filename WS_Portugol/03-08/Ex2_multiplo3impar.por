programa
{
	
	funcao inicio()
	{
		inteiro somaMult3 = 0;
		
		para (inteiro i=1; i <= 500; i++){
			se ((i % 2 != 0) e (i % 3 == 0 )){
				somaMult3 = somaMult3 + i;
			}
		}

		escreva("A soma dos impares multiplos de 3,\n");
		escreva("Entre de 1 á 500 é: ", somaMult3);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */