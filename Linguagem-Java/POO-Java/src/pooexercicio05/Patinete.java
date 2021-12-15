package pooexercicio05;

public class Patinete {

	private String marca;
	private String cor;
	private double comprimento;
	private double preco;
	private boolean novo;
	private boolean adulto;
	private boolean aVenda;
	
	public void status() {
		System.out.println("CARACTERISTICAS DO PATINETE:");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Compimento: " + this.getComprimento());
		System.out.println("Preço: " + this.getPreco());
		System.out.println("Ele é novo? " + this.getNovo());
		System.out.println("É para adultos? " + this.getAdulto());
	}
	
	public void vender() {
		this.setAVenda(true);
	}
	public void naoVender() {
		this.setAVenda(false);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean getNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public boolean getAdulto() {
		return adulto;
	}

	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}
	
	public boolean getAVenda() {
		return this.aVenda;
	}
	public void setAVenda(boolean aVenda) {
		this.aVenda = aVenda;
	}
	
	
}
