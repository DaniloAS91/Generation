programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro c; // código funcionaro
		real n, E, sal, TTsal; 
		// n = numero de horas
		// E = excesso de horas

		escreva("Entre com seu código: ");
		leia(c)
		escreva("Digite as horas trabalhadas: ");
		leia(n);

		se (n > 50.0){
			E = (n - 50) * 20.0;
		}
		senao{
			E = 0.0;
		}

		sal = (n*10) - E;
		TTsal = sal + E;

		limpa();
		escreva("\nSeu salario base é:", mat.arredondar(sal, 2));
		escreva("\nSaldo de horas extras é: ", mat.arredondar(E,2));
		escreva("\nSalario Total: ",mat.arredondar(TTsal, 2));
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */