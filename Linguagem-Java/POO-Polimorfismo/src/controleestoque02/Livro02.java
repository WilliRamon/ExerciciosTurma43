package controleestoque02;

public class Livro02 extends Produto02{
	private int paginas;
	private boolean aberto;
	
	@Override
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("C�digo de barra: + " + this.getCodigoBarra());
		System.out.println("Tamanho: " + this.getTamanho());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("� novo? " + this.getNovo());
		System.out.println("Quantidade de paginas: " + this.getPaginas());
	}
	
	public void arrancarPagina() {
		this.setPaginas(getPaginas() - 1);
	}
	public void abrir() {
		this.setAberto(true);
		System.out.println("O livro est� aberto");
	}
	public void fechar() {
		this.setAberto(false);
		System.out.println("O livro est� fechado");
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
}

