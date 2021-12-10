package lista02condicionais;

import java.util.Scanner;

public class Lista02Exer01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Projeto para descobrir qual numero é maior!");
		System.out.print("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = ler.nextInt();
		
		if((n1 > n2) && (n1 > n3)) {
			System.out.println("O maior numero é o " + n1);
		}else if(n2 > n3) {
			System.out.println("O maior numero é o " + n2);
		}else {
			System.out.println("O maior numero é o " + n3);
			
		}

	}

}
