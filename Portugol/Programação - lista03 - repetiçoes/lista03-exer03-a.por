programa
{
	
	funcao inicio()
	{
		real num, soma=0, totalNum=0, media
		
		escreva("Digite um numero inteiro positivo para continuar ou um numero negativo para parar: ")
		leia(num)
	
		enquanto(num >= 0){
			soma = soma + num
			totalNum++

			escreva("Digite um numero inteiro positivo para continuar ou um numero negativo para parar: ")
			leia(num)
		}
		
		media = soma / totalNum

		escreva("\nForam digitados " + totalNum + " numeros")
		escreva("\nSomatório ", soma)
		escreva("\nMedia: ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */