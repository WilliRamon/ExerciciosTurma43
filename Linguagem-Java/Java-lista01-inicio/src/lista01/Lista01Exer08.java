package lista01;

import java.util.Scanner;

public class Lista01Exer08 {

	public static void main(String[] args) {
		float custofabrica, distribuidor, imposto, final01;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o custo de fábrica: ");
		custofabrica = ler.nextInt();
		
		distribuidor = (float) (custofabrica * 0.28);
		imposto = (float) (custofabrica * 0.45);
		
		final01 = custofabrica + distribuidor + imposto;
		
		System.out.println("Valor final para o consumidor é R$ " + final01);
	}

}
