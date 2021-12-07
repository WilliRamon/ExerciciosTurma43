programa
{
	
	funcao inicio()
	{
		real p, E=0, m=0
	
		escreva("Informe a quantidade, em quilos, de tomates: ")
		leia(p)

		E = p - 50
		m = E * 4

		se(E > 0)
		{
			escreva("Ops! Você excedeu a quantidade limite de tomates\n")
			escreva("Excedeu: ", E)
			escreva("\nMulta: ", m)
			
		}senao{
			E=0
			m=0
			escreva("Está tudo em ordem! Você não excedeu o limite de 50kg de tomate\n")
			escreva("Excesso: ", E + "\nMulta " + m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */