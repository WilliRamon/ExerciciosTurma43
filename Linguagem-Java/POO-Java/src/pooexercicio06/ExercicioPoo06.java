package pooexercicio06;

public class ExercicioPoo06 {

	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria("Willi", 500);
		
		cb1.setNumeroConta(123456789);
		
		cb1.sacar(200.5);
		cb1.depositar(1000);
		
		cb1.status();

	}

}
