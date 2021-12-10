programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
	inteiro num, x
	real media[6], vezes[10], n[6], mediaArit, soma=0

	para(x=0; x<10; x++){
		num = u.sorteia(1, 6)
		vezes[x] = num

		soma = soma + vezes[x]

		se(num == 1){
			n[0]++
		}senao se(num == 2){
			n[1]++
		}senao se(num == 3){
			n[2]++
		}senao se(num == 4){
			n[3]++
		}senao se(num == 5){
			n[4]++
		}senao{
			n[5]++
		}
		escreva("\t", vezes[x])
		
	}
	para(x=0; x<6; x++){
		media[x] = (n[x]/10)*100
	}
	mediaArit = soma/10
	escreva("\nMedia aritmetica: ", mediaArit)

	para(x=0; x<6; x++){
		escreva("\nPorcentagem de vezes que aparece o numero " + (x+1) +": ", media[x], "%")
	}

	se(n[5]>0){
		escreva("\n\nO maior numero foi o 6 e ele se repetiu ", n[5], " vezes")
	}senao se(n[4]>0){
		escreva("\n\nO maior numero foi o 5 e ele se repetiu ", n[4], " vezes")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */