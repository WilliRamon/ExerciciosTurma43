programa
{
	
	funcao inicio()
	{
		inteiro num, soma, x
	
		escreva("Digite um numero ")
		leia(num)

		soma = num

		faca{
			num--
			soma = soma + num
		}enquanto(num > 0)

		escreva("\nA somatória do numero digitado até zero é ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */