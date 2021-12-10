programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m2[4][6], x, y
	
		escreva("Vamos preencher os valores de duas matrizes!\n")

		para(x=0; x<4; x++){
			para(y=0; y<6; y++){
				escreva("\nNa PRIMEIRA matriz, preencha um valor na linha ", x, " coluna ", y, " ")
				leia(n1[x][y])
				escreva("\nNa SEGUNDA matriz, preencha um valor na linha ", x, " coluna ", y, " ")
				leia(n2[x][y])
			}
		}
		escreva("A matriz M2 é a diferença de cada posição da matriz n1 e n2\n")
		para(x=0; x<4; x++){
			para(y=0; y<6; y++){
				se(n1[x][y] >= n2[x][y]){
					m2[x][y] = n1[x][y] - n2[x][y]
				}senao{
					m2[x][y] = n2[x][y] - n1[x][y]
				}
				escreva(m2[x][y], "\t")
			}
			escreva("\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */