package exercicioheranca01;

public class ExercicioHerenca01 {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Cavalo cava = new Cavalo();
		Preguica preg = new Preguica();
		
		cao.setNome("Leônidas");
		cao.setIdade(6);
		cao.pararSom();
		cao.comecaCorrer();
		cao.informacoes();
		
		System.out.println();
		
		cava.setNome("Beto Cavalo");
		cava.setIdade(10);
		cava.emitirSom();
		cava.comecaCorrer();
		cava.informacoes();
		
		System.out.println();
		
		preg.setNome("Flash");
		preg.setIdade(5);
		preg.pararSom();
		preg.subirArvore();
		preg.informacoes();
	}

}
