package lista02condicionais;

import java.util.Scanner;

public class Lista02Exer04 {

	public static void main(String[] args) {
		double num, raiz, expo;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		num = ler.nextDouble();
		
		if(num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println("O numero " + num + " � par e sua raiz quadrada � " + raiz);
		}else {
			expo = Math.pow(num, 2);
			System.out.println("O numero " + num + " � impar e elevado ao quadrado � " + expo);
			
		}
	}

}
