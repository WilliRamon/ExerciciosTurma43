package lista02condicionais;

import java.util.Scanner;

public class Lista02Exer02 {

	public static void main(String[] args) {
		int n1, n2, n3, primeiro, segundo, terceiro;
		Scanner ler = new Scanner(System.in);
		System.out.println("Ordem crescente");
		System.out.print("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = ler.nextInt();
		
		if((n1 > n2) && (n1 > n3) && (n2 > n3)) {
			primeiro = n1;
			segundo = n2;
			terceiro = n3;
		}else if((n1 > n2) && (n1 > n3) && (n3 > n2)) {
			primeiro = n1;
			segundo = n3;
			terceiro = n2;
		}else if((n2 > n3) && (n1 > n3)) {
			primeiro = n2;
			segundo = n1;
			terceiro = n3;
		}else if((n2 > n3) && (n3 > n1)) {
			primeiro = n2;
			segundo = n3;
			terceiro = n1;
		}else if(n1 > n2) {
			primeiro = n3;
			segundo = n1;
			terceiro = n2;
		}else {
			primeiro = n3;
			segundo = n2;
			terceiro = n1;
		}
		
		System.out.println("Ordem crescente: " + terceiro + " , " + segundo + " , " + primeiro);
	}

}
