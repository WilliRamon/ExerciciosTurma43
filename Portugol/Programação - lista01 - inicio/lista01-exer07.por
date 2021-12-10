programa
{
	
	funcao inicio()
	{
		real a, b, c, d, e1, f, x, y
		
		escreva("Para encontrar os valores de x e y, digite o valores pedidos\n")
		escreva("\nDigite o valor de A: ")
		leia(a)

		escreva("\nDigite o valor de B: ")
		leia(b)

		escreva("\nDigite o valor de C: ")
		leia(c)

		escreva("\nDigite o valor de D: ")
		leia(d)

		escreva("\nDigite o valor de E: ")
		leia(e1)

		escreva("\nDigite o valor de F: ")
		leia(f)

		x = (c*e1 - b*f) / (a*e1 - b*d)
		y = (a*f - c*d) / (a*e1 - b*d)

		escreva("\nValor de x é: " + x)
		escreva("\nValor de y é: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */