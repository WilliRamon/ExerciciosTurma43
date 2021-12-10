import java.util.Scanner;

public class Lista03Exer03 {

	public static void main(String[] args) {
		int idade, menos21=0, mais50=0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma idade ou -99 para parar: ");
		idade = ler.nextInt();
		while(idade != -99) {
			if(idade <= 21) {
				menos21++;
			}else if(idade >= 50) {
				mais50++;
			}
			System.out.print("Digite uma idade ou -99 para parar: ");
			idade = ler.nextInt();
			
		}
		System.out.println("Você digitou " + menos21 + " numero menores que 21 e " + mais50 + " maior que 50");

	}

}
