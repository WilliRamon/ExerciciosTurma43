package lista01;

import java.util.Scanner;

public class Lista01Exer03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float calculo;
		int ventrada, s, m, h;
		
		System.out.print("Informe os segundo: ");
		ventrada = ler.nextInt();
		
		h = ventrada / 3600;
		m = (ventrada % 3600) / 60;
		s = (ventrada % 3600) % 60;
		
		System.out.println(ventrada + " segundos corresponde a " + h + " horas, " + m + " minutos e " + s + " segundos");

	}

}
