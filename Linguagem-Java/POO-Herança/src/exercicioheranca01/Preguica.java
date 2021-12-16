package exercicioheranca01;

public class Preguica extends Animal{
	private boolean subir;
	
	public void subirArvore() {
		this.setSubir(true);
		System.out.println("A preguiça está subindo na árvore");
	}
	public void descerArvore() {
		this.setSubir(false);
		System.out.println("A preguiça está descendo da árvore");
	}
	
	@Override
	public void emitirSom() {
		this.setSom(true);
		System.out.println("Sons de Pregiça");
	}

	public boolean getSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}
	
	
}
