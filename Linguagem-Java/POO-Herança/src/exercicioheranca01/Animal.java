package exercicioheranca01;

public class Animal {
	private String nome;
	private int idade;
	private boolean som;
	
	public void emitirSom() {
		this.setSom(true);
		System.out.println("Sons de mamifero");
	}
	public void pararSom() {
		this.setSom(false);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
	
	
	
	public void informacoes() {
		System.out.println("O nome dele é: " + this.getNome());
		System.out.println("A idade dele é " + this.getIdade());
		System.out.println("Ele emitindo som? " + this.getSom());
	}
	
}
