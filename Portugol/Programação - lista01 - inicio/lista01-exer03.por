programa
{
	
	funcao inicio()
	{
		real calculo
		inteiro ventrada, s, m, h

		escreva("informe os segundos :")
		leia(ventrada)

		h = ventrada / 3600
		m = (ventrada % 3600) / 60
		s = (ventrada % 3600) % 60

		escreva("\n" + ventrada + " segundos corresponde a " + h + " horas, " + m + " minutos e " + s + " segundos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */