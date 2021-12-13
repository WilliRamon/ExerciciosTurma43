import java.util.Scanner;

public class Lista04Exer01 {

	public static void main(String[] args) {
		int num[] = new int[5], x, maior=0;
		Scanner ler = new Scanner(System.in);
		for(x=0; x < num.length; x++) {
			System.out.print("Digite o valor de numero " + (x + 1) + ": " );
			num[x] = ler.nextInt();
			
			if(num[x] > maior) {
				maior = num[x];
			}
		}
		System.out.println("Valores digitados: ");
		for(x = 0; x < num.length; x++) {
			System.out.print(num[x] + " ");
		}
		System.out.println("\nMaior numero digitado foi " + maior);
		

	}

}
