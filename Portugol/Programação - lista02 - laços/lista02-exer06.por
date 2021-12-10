programa
{
	
	funcao inicio()
	{
		inteiro idade
	
		escreva("Informe a idade do nadador")
		leia(idade)

		se(idade >= 18){
			escreva("Você está na categoria ADULTA")
		}senao se(idade >= 14){
			escreva("Você está na categoria JUVENIL B")
		}senao se(idade >= 12){
			escreva("Você está na categoria JUVENIL A")
		}senao se(idade >= 8){
			escreva("Você está na categoria INFANTIL B")
		}senao se(idade >= 5){
			escreva("Você está na categoria INFANTIL A")
		}senao{
			escreva("Você ainda não tem idade para competir")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 526; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */