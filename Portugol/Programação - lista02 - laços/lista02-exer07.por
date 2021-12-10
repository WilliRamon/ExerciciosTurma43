programa
{
	
	funcao inicio()
	{
		real base, altura, area
	
		escreva("Partiu calcular a área de um triangulo?!\n")
		escreva("\nPrimeiro, informe o valor da base: ")
		leia(base)
		escreva("\nAgora, informe a altura: ")
		leia(altura)

		se(base > 0 e altura > 0){
			area = (base * altura) / 2
			escreva("A área do triangulo é: ", area)
		}senao{
			escreva("\nOs valores digitados não são validos.Base e altura precisam ser positivos e maiores que zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */