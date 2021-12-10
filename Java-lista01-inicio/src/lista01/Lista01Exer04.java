package lista01;

import java.util.Scanner;

public class Lista01Exer04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double r, s, d;
		
		System.out.print("Digite um valor inteiro para A: ");
		a = ler.nextInt();
		
		System.out.print("Digite um valor inteiro para B: ");
		b = ler.nextInt();
		
		System.out.print("Digite um valor inteiro para C: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r + s) / 2;
		
		System.out.println("Valor de D é: " + d);

	}

}
