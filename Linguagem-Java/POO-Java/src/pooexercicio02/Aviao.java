package pooexercicio02;

public class Aviao {
	
	private String modelo;
	private String companhia;
	private String cor;
	private double tamanho;
	private int quantidadeAssentos;
	private boolean voando;
	private boolean quebrado;
	
	public void podeVoar() {
		if(this.quebrado == true) {
			System.out.println("Ele está quebrado. Não tem condições de vôo");
			this.voando = false;
		}else {
			System.out.println("Ele está apto para vôo");
		}
	}
	public void voar() {
		this.voando = true;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCompanhia() {
		return companhia;
	}



	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public double getTamanho() {
		return tamanho;
	}



	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}



	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}



	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}



	public boolean getVoando() {
		return voando;
	}



	public void setVoando(boolean voando) {
		this.voando = voando;
	}



	public boolean getQuebrado() {
		return quebrado;
	}



	public void setQuebrado(boolean quebrado) {
		this.quebrado = quebrado;
	}



	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Empresa: " + this.companhia);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Quantidade de assentos: " + this.quantidadeAssentos);
		System.out.println("O avião está voando? " + this.voando);
	}
	
}
