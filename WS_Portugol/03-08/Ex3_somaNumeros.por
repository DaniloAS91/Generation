programa
{
	
	funcao inicio()
	{
		real n = 0.0, md=0.0, soma=0.0, ttNum=0.0;

		escreva("Digite o primeiro numero: ");
		leia(n);
		
		enquanto(n > 0.0 ){			
			soma = soma + n;
			ttNum += 1;
			
			escreva("Digite outro numero: ");
			leia(n);
	
		}
		md = soma / ttNum;

		escreva("\nA somatória dos numeros é: ", soma);
		escreva("\nA média dos números é: ", md);
		escreva("\nO total de numeros inseridos é: ", ttNum);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 148; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */