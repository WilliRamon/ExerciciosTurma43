package pooexercicio07;

import java.util.Scanner;

public class ExercicioPoo07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Paciente p1 = new Paciente("Willi");
		
		System.out.println("Dados do paciente");
		System.out.print("Digite o peso: ");
		p1.setPeso(ler.nextDouble());
		System.out.print("Altura: ");
		p1.setAltura(ler.nextDouble());
		System.out.print("Especialidade: ");
		p1.setEspecialidade(ler.nextLine());
		System.out.print("Sintomas: " );
		p1.setSintomas(ler.nextLine());
		
		p1.espera();
		
		p1.status();

	}

}
