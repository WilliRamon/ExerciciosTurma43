package pooexercicio01;

public class Cliente {

		private String nome;
		private int cpf;
		private String endereco;
		private int idade;
		private double divida;
		private double quantidadeComprada;
		
		public Cliente(String nome) {
			this.nome = nome;
		}
		
		//MÉTODOS
		
		public void pagarDivida(double x) {
			this.divida -= x;
		}
		public void fazerDivida(double x) {
			this.divida += x;
		}
		public void somarCompra(double x) {
			this.quantidadeComprada += x;
		}
		
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double getDivida() {
			return divida;
		}

		public void setDivida(double divida) {
			this.divida = divida;
		}

		public double getQuantidadeComprada() {
			return quantidadeComprada;
		}

		public void setQuantidadeComprada(double quantidadeComprada) {
			this.quantidadeComprada = quantidadeComprada;
		}
		
		public void status(){
			System.out.println("Nome: " + this.nome);
			System.out.println("Cpf: " + this.idade);
			System.out.println("Endereço: " + this.endereco);
			System.out.println("Divida atual: " + this.divida);
			System.out.println("Ele já comprou:  " + this.quantidadeComprada);
		}
		
		
		
}
