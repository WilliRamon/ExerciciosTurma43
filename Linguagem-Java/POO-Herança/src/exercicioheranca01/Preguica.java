package exercicioheranca01;

public class Preguica extends Animal{
	private boolean subir;
	
	public void subirArvore() {
		this.setSubir(true);
		System.out.println("A pregui�a est� subindo na �rvore");
	}
	public void descerArvore() {
		this.setSubir(false);
		System.out.println("A pregui�a est� descendo da �rvore");
	}
	
	@Override
	public void emitirSom() {
		this.setSom(true);
		System.out.println("Sons de Pregi�a");
	}

	public boolean getSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}
	
	
}
