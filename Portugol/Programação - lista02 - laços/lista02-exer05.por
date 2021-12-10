programa
{
	
	funcao inicio()
	{
		real p
	
		escreva("Informe o indice de poluição médio: ")
		leia(p)

		se(p >= 0.5){
			escreva("Todos os grupos devem suspender as atividades!") 
		}senao se(p >= 0.4){
			escreva("Primeiro e Segundo grupo devem suspender as atividades")
		}senao se(p >= 0.3){
			escreva("Apenas o Primeiro grupo deve suspender as ativdades")
		}senao{
			escreva("Todos os grupos podem operar normalmente")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */