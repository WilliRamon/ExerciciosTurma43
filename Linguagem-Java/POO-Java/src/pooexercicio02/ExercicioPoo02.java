package pooexercicio02;

public class ExercicioPoo02 {

	public static void main(String[] args) {
		Aviao a1 = new Aviao();
		
		a1.setModelo("Boeing 737");
		a1.setCompanhia("TAM");
		a1.setCor("Vermelho e Branco");
		a1.setTamanho(31.2);
		a1.setQuantidadeAssentos(200);
		//a1.setQuebrado(true);
		a1.voar();
		a1.status();
		System.out.println();
		a1.podeVoar();

	}

}
