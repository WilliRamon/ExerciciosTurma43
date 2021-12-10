package lista01;

import java.util.Scanner;

public class Lista01Exer07 {

	public static void main(String[] args) {
		float a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Para encontrar os valores de x e y, digite o valores pedidos");
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		c = ler.nextInt();
		System.out.print("Digite o valor de D: ");
		d = ler.nextInt();
		System.out.print("Digite o valor de E: ");
		e = ler.nextInt();
		System.out.print("Digite o valor de F: ");
		f = ler.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("Valor de x é: " + x);
		System.out.println("Valor de y é: " + y);

	}

}
