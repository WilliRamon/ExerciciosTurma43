programa
{
	
	funcao inicio()
	{
		inteiro x, y, mat[3][3], soma=0, somaDiagonal=0
		
		escreva("Preencha os valores da matriz\n")
		para(x=0; x<3; x++){
			para(y=0; y<3; y++){
				escreva("\nPreencha um valor na linha ", x, " coluna ", y, " ")
				leia(mat[x][y])

				soma = soma + mat[x][y]
			}
		}
		somaDiagonal = mat[0][0] + mat[1][1] + mat[2][2]
		escreva("\nSomatória de todos os numeros da matriz: ", soma)
		escreva("\nSomatória da coluna 0 da matriz: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */