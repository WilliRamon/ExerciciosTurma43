package lista01;

import java.util.Scanner;

public class Lista01Exer06 {

	public static void main(String[] args) {
		float x1, x2, y1, y2, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("No plano 1, informe x1: ");
		x1 = ler.nextInt();
		
		System.out.print("No plano 1, informe y1: ");
		y1 = ler.nextInt();
		
		System.out.print("No plano 2, informe x2: ");
		x2 = ler.nextInt();
		
		System.out.print("No plano 2, informe y2: ");
		y2 = ler.nextInt();
		
		d = (float) Math.sqrt((float) (Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2)));
		
		System.out.println("O valor de D é: " + d);

	}

}
