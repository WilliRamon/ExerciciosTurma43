programa
{
	
	funcao inicio()
	{
		real custofabrica, distribuidor, imposto, final
		
		escreva("Informe o custo de fábrica: ")
		leia(custofabrica)

		distribuidor = custofabrica * 0.28
		imposto = custofabrica * 0.45

		final = custofabrica + distribuidor + imposto

		escreva("\nValor final para o consumidor é R$ " + final)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */