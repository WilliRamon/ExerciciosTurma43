import java.util.Scanner;

public class Lista03Exer05 {

	public static void main(String[] args) {
		int num, soma=0;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.print("Digite um numero para somar:");
			num = ler.nextInt();
			soma += num;
		}while(num > 0);
		
		System.out.println("A somatória dos números digitados foram: " + soma);
	}

}
