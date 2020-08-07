programa
{
	
	funcao inicio()
	{
		inteiro qtFilhos;
		real sal, mSal=0.0, mdSal=0.0, mdFilho=0.0, perc100=0.0;

		para (inteiro i=1; i<=20; i++){
			limpa();
			escreva("digite o salario da pessoa ", i,": ");
			leia(sal);
			escreva("Qtde de filhos da pessoa ", i,": ");
			leia(qtFilhos);

			
			mdFilho = mdFilho + qtFilhos;
			mdSal = mdSal + sal;

			se (sal <= 100){
				perc100 += 1;	
			}
			se (sal > mSal){
				mSal = sal;
			}
		}

		mdSal = mdSal/20;
		perc100 = (perc100 * 100)/20;
		mdFilho = mdFilho/20;

		limpa();
		escreva("\nA média dos Salarios é: ", mdSal);
		escreva("\nA média de Filhos é: ", mdFilho);
		escreva("\nO maior Salario é: ", mSal);
		escreva("\nO percentual de salarios até R$ 100,00 é: ", perc100);
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */