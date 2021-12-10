programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, p2, p3, p5, media

	
		escreva("Digite a primeira nota: ")
		leia(nota1)

		escreva("\nDigite a segunda nota: ")
		leia(nota2)

		escreva("\nDigite a terceira nota: ")
		leia(nota3)

		p2 = nota1 * 2
		p3 = nota2 * 3
		p5 = nota3 * 5

		media = (p2 + p3 + p5) / 10

		escreva("\nA média final desse aluno é: " + media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */