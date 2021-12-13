import java.util.Scanner;

public class Lista03Exer04 {

	public static void main(String[] args) {
		int x=1, idade, cont = 1, sexo, emocional, contNervoso=0, contCalmo=0, pessoaCalma=0, mulherCalma=0, homemCalmo=0, outroCalmo=0, mulherNervosa=0, homemNervoso=0, outroNervoso=0, mulherAgressiva=0, homemAgressivo=0, outroAgressivo=0;
		System.out.println("Cadastro de caracteristicas psicológicas");
		
		while(cont <= 150) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Informe a idade numero " + x + ": ");
			idade = ler.nextInt();
			System.out.println("Digite o numero correspondente");
			System.out.println("Sexo: 1 - Feminino | 2 - Masculino | 3 - Outros");
			sexo = ler.nextInt();
			if(sexo == 1) {
				System.out.println("Você se considera: 1 - Calma | 2 - Nervosa | 3 - Agressiva");
				emocional = ler.nextInt();
				if(emocional == 1) {
					mulherCalma++;
					pessoaCalma++;
					if(idade <= 18) {
						contCalmo++;
					}
				}else if(emocional == 2) {
					mulherNervosa++;
					if(idade >= 40) {
						contNervoso++;
					}
				}else if(emocional == 3) {
					mulherAgressiva++;
				}
			}else if(sexo == 2) {
				System.out.println("Você se considera: 1 - Calma | 2 - Nervosa | 3 - Agressiva");
				emocional = ler.nextInt();
				if(emocional == 1) {
					homemCalmo++;
					pessoaCalma++;
					if(idade <= 18) {
						contCalmo++;
					}else if(emocional == 2) {
						homemNervoso++;
						if(idade >= 40) {
							contNervoso++;
						}
					}else if(emocional == 3) {
						homemAgressivo++;
					}
				}
			}else if(sexo == 3) {
				System.out.println("Você se considera: 1 - Calma | 2 - Nervosa | 3 - Agressiva");
				emocional = ler.nextInt();
				if(emocional == 1) {
					outroCalmo++;
					pessoaCalma++;
					if(idade <= 18) {
						contCalmo++;
					}
				}else if(emocional == 2) {
					outroNervoso++;
					if(idade >= 40) {
						contNervoso++;
					}
				}else if(emocional == 3) {
					outroAgressivo++;
				}
			}
			x++;
			cont++;

		}
		System.out.println("Resumo:");
		System.out.println("Numero de pessoas calmas: " + pessoaCalma);
		System.out.println("Numero de pessoas nervosas: " + mulherNervosa);
		System.out.println("Numero de homens agressivos: " + homemAgressivo);
		System.out.println("Numero de Outros Calmos: " + outroCalmo);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: " + contNervoso);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: " + contCalmo);

	}

}
