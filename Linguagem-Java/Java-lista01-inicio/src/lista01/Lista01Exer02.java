package lista01;

import java.util.Scanner;

public class Lista01Exer02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia, idade;
		
		System.out.println("Entrando com sua idade em dias e saindo no formato dia, mês e ano");
		System.out.print("Informe sua idade em dias: ");
		idade = ler.nextInt();
		
		ano = idade/365;
		mes = (idade - ano * 365) / 30;
		dia = idade - (ano * 365 + mes * 30);
		
		System.out.println("Você tem " + ano + " anos, " + mes + " meses e " + dia + " dias e idade");

	}

}
