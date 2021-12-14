package pooexercicio01;

public class ExercicioPoo01 {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ramon");
		
		c1.setCpf(1234567);
		c1.setIdade(26);
		c1.setEndereco("Rua Brasil, n. 50");
		
		c1.somarCompra(500.50);
		c1.somarCompra(1000);
		
		c1.status();

	}

}
