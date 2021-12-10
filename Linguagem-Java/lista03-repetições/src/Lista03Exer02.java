import java.util.Scanner;

public class Lista03Exer02 {

	public static void main(String[] args) {
		int x, num, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		for(x = 0; x < 10; x++) {
			System.out.print("Digite o numero " + (x+1) + ": ");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Você digitou " + par + " pares e " + impar + " impares");

	}

}
