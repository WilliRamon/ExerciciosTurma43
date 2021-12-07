programa
{
	
	funcao inicio()
	{
		inteiro num
	
		escreva("Digite um numero inteiro: ")
		leia(num)

		se(num % 2 == 0 e num >= 0){
			escreva("O numero que você digitou é par e positivo")
		}senao se(num % 2 == 0 e num < 0){
			escreva("O numero que você digitou é par e negativo")
		}senao se(num % 2 != 0 e num >= 0){
			escreva("O numero que você digitou é impar e positivo")
		}senao{
			escreva("O numero que você digitou é impar e negativo")
		}
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