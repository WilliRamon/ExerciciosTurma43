programa
{
	
	funcao inicio()
	{
		inteiro x, filho, somaFilho = 0
		real salario, somaSalario = 0, mediaSalario, mediaFilho, maiorSalario = 0, s100 = 0, p100
	
		para(x = 1; x <= 20; x++){
			escreva("Pessoa " + x + ". Informe o salário: ")
			leia(salario)
			escreva("Pessoa " + x + ". Informe a quantidade de filhos ")
			leia(filho)

			somaSalario = somaSalario + salario
			somaFilho = somaFilho + filho

			se(salario > maiorSalario){
				maiorSalario = salario
			}

			se(salario <= 100){
				s100++
			}
		}

		mediaSalario = somaSalario / 20
		mediaFilho = somaFilho / 20
		
		p100 = (100 * s100) / 20

		escreva("\nMédia de salário da população é: ", mediaSalario)
		escreva("\nMédia e filhos: ", mediaFilho)
		escreva("\nMaior salário: ", maiorSalario)
		escreva("\nO percentual de pessoas com salário de até R$ 100,00 é: ", p100, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 852; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */