package exercicioheranca01;

public class Cachorro extends Animal{
	private boolean correr;
	
	public void comecaCorrer() {
		this.setCorrer(true);
		System.out.println("O cachorro come�ou a correr!");
	}
	public void pararCorrer() {
		this.setCorrer(false);
		System.out.println("O cachorro parou de correr!");
	}

	public boolean getCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	

	
	
}
