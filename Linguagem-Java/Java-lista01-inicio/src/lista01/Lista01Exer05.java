package lista01;

import java.util.Scanner;

public class Lista01Exer05 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, p2, p3, p5, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = ler.nextInt();
		
		p2 = nota1 * 2;
		p3 = nota2 * 3;
		p5 = nota3 * 5;
		
		media = (p2 + p3 + p5) / 10;
		
		System.out.println("A média final desse aulno é: " + media);
	}

}
