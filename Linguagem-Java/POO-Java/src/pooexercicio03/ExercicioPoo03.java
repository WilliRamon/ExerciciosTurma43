package pooexercicio03;

public class ExercicioPoo03 {

	public static void main(String[] args) {
		ProdutoEletronico pe1 = new ProdutoEletronico("Celular");
		
		pe1.setMarca("Samsung");
		pe1.setCor("Dourado");
		pe1.setCarga(50);
		pe1.setTouchScreen(true);
		pe1.setTamanho(12.2);
		pe1.setNovo(true);
		
		pe1.desligar();
		pe1.quebrou();
		
		pe1.status();

	}

}
