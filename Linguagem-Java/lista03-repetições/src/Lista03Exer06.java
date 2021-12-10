import java.util.Scanner;

public class Lista03Exer06 {

	public static void main(String[] args) {
		double num, cont=0, soma=0, media;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		num = ler.nextInt();
		do {
			if(num % 3 == 0) {
				soma += num;
				cont++;
			}
			System.out.print("Digite um numero: ");
			num = ler.nextInt();
		}while(num > 0);
		media = soma / cont;
		System.out.println("Média dos multiplos de 3: " + media);
	}

}
