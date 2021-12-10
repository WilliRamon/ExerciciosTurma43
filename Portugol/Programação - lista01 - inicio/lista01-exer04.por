programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro a, b, c
		real r, s, d
	
		escreva("Digite um valor inteiro para A: ")
		leia(a)

		escreva("\nDigite um valor inteiro para B: ")
		leia(b)

		escreva("\nDigite um valor inteiro para C: ")
		leia(c)

		r = mat.potencia((a + b), 2)
		
		s = mat.potencia((b + c), 2)

		d = (r + s) / 2

		escreva("\nValor de D é: " + d)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */