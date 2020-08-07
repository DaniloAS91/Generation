programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro n = 10;
		inteiro vetor[n], deu6 = 0, md = 0, i;

		para (i = 0; i < n; i++){
			vetor[i] = Util.sorteia(1, 6);

			md = md + (vetor[i]);
			
			se (vetor[i] == 6){
				deu6++;
			}
		}
		md = md / 10;
		escreva ("Numeros sorteados:");
		
		para (i = 0; i < n; i++){
			escreva ("[ ", vetor[i], " ]");	
		}
		escreva("\nQtde de numero da maior numeração: ", deu6);
		escreva("\nA média dos numeros é: ", md);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */