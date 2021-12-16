package controleestoque02;

public abstract class Produto02 {
	private String modelo;
	private int codigoBarra;
	private double tamanho;
	private String cor;
	private boolean ligado;
	private boolean novo;
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Código de barra: " + this.getCodigoBarra());
		System.out.println("Tamanho: " + this.getTamanho());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("É novo? " + this.getNovo());
	}
	
	public void liga() {
		this.setLigado(true);
		System.out.println("O produto está ligado");
	}
	public void desliga() {
		this.setLigado(false);
		System.out.println("O produto está desligado");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(int codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
}
