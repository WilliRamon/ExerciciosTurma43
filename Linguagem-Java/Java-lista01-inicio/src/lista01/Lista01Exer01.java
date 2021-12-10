package lista01;

import java.util.Scanner;

public class Lista01Exer01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, soma;
		
		System.out.println("Sua idade expressa em dias!!! \nPara isso, informe usa idade divida entre: anos, meses e dias");
		System.out.print("Pra começar, informe os anos: ");
		anos = ler.nextInt();
		
		System.out.print("Informe os meses: ");
		meses = ler.nextInt();
		
		System.out.print("Informe os dias: ");
		dias = ler.nextInt();
		
		soma = anos * 365 + meses * 30 + dias;
		
		System.out.println("Você tem " + soma + " dias de vida");
	}

}
