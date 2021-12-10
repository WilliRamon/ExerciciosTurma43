programa
{  
	
	funcao inicio()
	{
		
		inteiro ano, mes, dia, idade

		escreva("Entrando com sua idade em dias e saindo no formato dia, mês e ano\n")
		escreva("\nInforme sua idade em dias")
		leia(idade)

		ano = idade / 365
		mes = (idade - ano * 365) / 30
		dia = idade - (ano * 365 + mes * 30)

		escreva("Você tem " + ano + " anos, " + mes +" meses e " + dia + " dias e idade")
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