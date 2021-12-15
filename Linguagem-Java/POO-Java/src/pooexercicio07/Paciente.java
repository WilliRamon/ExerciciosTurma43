package pooexercicio07;

public class Paciente {
	private String nome;
	private double peso;
	private double altura;
	private String especialidade;
	private String sintomas;
	private boolean atendido;
	
	public Paciente(String nome) {
		this.setNome(nome);
	}
	
	public void status() {
		System.out.println("CADASTRO PACIENTE");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Especialidade de atendimento: " + this.getEspecialidade());
		System.out.println("Sintomas: " + this.getSintomas());
		System.out.println("Já foi atendido? " + this.getAtendido());
	}
	
	public void atendido() {
		this.setAtendido(true);
	}
	public void espera() {
		this.setAtendido(false);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public boolean getAtendido() {
		return atendido;
	}
	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}
	
	
	
	
	
	
}
