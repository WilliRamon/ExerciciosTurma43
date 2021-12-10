programa
{
	
	funcao inicio()
	{
		inteiro c
		real n, s, E
	
		escreva("Olá! Primeiramente, digite seu código: ")
		leia(c)
		escreva("Agora, informe a quantidade de horas trabalhadas: ")
		leia(n)

		se(n <= 50)
		{
			s = n * 10
			escreva("Seu salário é de: ", s)
		}
		senao
		{
			E = (n - 50) * 20
			s = 50 * 10 + E
			escreva("Como você excedeu o limite de 50 horas trabalhadas, você receberá por esse excedente\n")
			escreva("Seu salário com excedente é: ", s)
			escreva("\nApenas seu salário excedido: ", E)
				
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