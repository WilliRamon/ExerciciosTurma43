package pooexercicio06;

public class ContaBancaria {
	private String nome;
	private int numeroConta;
	private double saldo;
	
	
	public ContaBancaria(String nome, double saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
	}
	
	public void status() {
		System.out.println("CONTA BANCARIA");
		System.out.println("Nome do cliente: " + this.getNome());
		System.out.println("Numero da conta: " + this.getNumeroConta());
		System.out.println("Saldo em conta: "  + this.getSaldo());
	}
	
	public void sacar(double s) {
		if((this.saldo > 0) && (this.saldo - s >= 0)) {
			this.saldo -= s;
		}else {
			System.out.println("Saldo insuficiente para realizar saque");
		}
	}
	public void depositar(double d) {
		this.saldo += d;
	}
	public double VerSaldo() {
		System.out.println(this.saldo);
		return this.saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
