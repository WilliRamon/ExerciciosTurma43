package pooexercicio05;

import java.util.Scanner;

public class ExercicioPoo05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Patinete p1 = new Patinete();
		
		System.out.print("Diga qual � a marca do seu patinete: ");
		p1.setMarca(ler.nextLine());
		System.out.print("Qual � a cor dela? ");
		p1.setCor(ler.nextLine());
		System.out.print("Comprimento de uma ponta a outra: " );
		p1.setComprimento(ler.nextDouble());
		System.out.print("Voc� quer vender ele? ");
		p1.setAVenda(ler.nextBoolean());
		if(p1.getAVenda() == true) {
			System.out.print("Qual � o pre�o de venda? ");
			p1.setPreco(ler.nextDouble());
		}
		System.out.print("� para adulto? ");
		p1.setAdulto(ler.nextBoolean());
		
		p1.status();
	}

}
