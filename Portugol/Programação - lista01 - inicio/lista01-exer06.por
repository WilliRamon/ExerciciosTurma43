programa
{	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d
		
		escreva("No plano 1, informe o x1: ")
		leia(x1)

		escreva("\nNo plano 1, informe o y1: ")
		leia(y1)

		escreva("\nNo plano 2, informe x2: ")
		leia(x2)

		escreva("\nNo plano, informe y2: ")
		leia(y2)

		d = mat.raiz(mat.potencia((x2 - x1), 2) + mat.potencia((y2 - y1), 2), 2)

		escreva("\nO valor de D é " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */