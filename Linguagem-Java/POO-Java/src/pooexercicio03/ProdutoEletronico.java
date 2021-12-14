package pooexercicio03;

public class ProdutoEletronico {
	
	private String produto;
	private String marca;
	private String cor;
	private int carga;
	private double tamanho;
	private boolean touchScreen;
	private boolean novo;
	private boolean quebrado;
	private boolean ligado;
	
	public ProdutoEletronico(String produto) {
		this.produto = produto;
	}
	
	public void quebrou() {
		this.quebrado = true;
	}
	public void zeroBala() {
		this.quebrado = false;
	}
	public void ligar() {
		this.ligado = true;
	}
	public void desligar() {
		this.ligado = false;
	}
	
	
	
	
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
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

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public boolean isQuebrado() {
		return quebrado;
	}

	public void setQuebrado(boolean quebrado) {
		this.quebrado = quebrado;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void status() {
		System.out.println("Esse produto é um " + this.produto);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Carga de " + this.carga + "%");
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Ele é Touch Screen? " + this.tamanho);
		System.out.println("Ele é novo? " + this.novo);
		System.out.println("Está quebrado? " + this.quebrado);
		System.out.println("Está ligado? " + this.ligado);
	}
}
