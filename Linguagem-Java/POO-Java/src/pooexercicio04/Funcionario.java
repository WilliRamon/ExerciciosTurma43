package pooexercicio04;

public class Funcionario {

	private String nome;
	private String cargo;
	private String area;
	private int idade;
	private boolean ferias;
	
	public Funcionario(String nome) {
		this.setNome(nome);
	}
	
	
	public void entrarFerias() {
		this.ferias = true;
	}
	public void sairFerias() {
		this.ferias = false;
	}
	
	public void status() {
		System.out.println("Dados Cadastrais do Funcionário: ");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Área: " + this.getArea());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Está de férias? " + this.getFerias());
	}
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public String getArea() {
		return area;
	}




	public void setArea(String area) {
		this.area = area;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public boolean getFerias() {
		return ferias;
	}




	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}





}
