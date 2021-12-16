package exercicioheranca01;

public class Cachorro extends Animal{
	private boolean correr;
	
	public void comecaCorrer() {
		this.setCorrer(true);
		System.out.println("O cachorro começou a correr!");
	}
	public void pararCorrer() {
		this.setCorrer(false);
		System.out.println("O cachorro parou de correr!");
	}
	
	@Override
	public void emitirSom() {
		this.setSom(true);
		System.out.println("Sons de Cavlalo");
	}

	public boolean getCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	

	
	
}
