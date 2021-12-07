programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro soma = 0 

		escreva("Sua idade expressa em dias!!! \nPara isso, informe usa idade divida entre: anos, meses e dias\n")
		
		escreva("Informe os anos: ")
		leia(anos)

		escreva("Informe os meses: ")
		leia(meses)
		
		escreva("Informe os dias: ")
		leia(dias)

		soma = anos * 365 + meses * 30 + dias

		escreva("\nVocê tem " + soma + " dias de vida")
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