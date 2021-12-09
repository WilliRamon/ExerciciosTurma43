package lista02condicionais;

import java.util.Scanner;

public class Lista02Exer03 {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você está na categoria ADULTA");
		}else if(idade >= 15) {
			System.out.println("Você está na categoria JUVENIL");
		}else if(idade >= 10) {
			System.out.println("Você está na categoria INFANTIL");
		}
	}

}
