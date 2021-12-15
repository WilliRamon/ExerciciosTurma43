package pooexercicio04;

public class ExercicioPoo04 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Willi");
		
		f1.setCargo("Desenvolvedor Java - jr");
		f1.setArea("TI");
		f1.setIdade(26);
		f1.sairFerias();
		
		f1.status();

	}

}
