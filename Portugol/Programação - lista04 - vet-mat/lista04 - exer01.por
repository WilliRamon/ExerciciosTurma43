programa
{
	
	funcao inicio()
	{
		inteiro num[5], x, maior=0

		para(x=0; x<5; x++){
			escreva("Escreva a nota ", x+1, ": ")
			leia(num[x])

			se(num[x] > maior){
				maior = num[x]
			}
		}
		limpa()
		para(x=0; x<5; x++){
			escreva("\nNota: ", x+1, " é ", num[x])
		}

		escreva("\nA maior nota é ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */