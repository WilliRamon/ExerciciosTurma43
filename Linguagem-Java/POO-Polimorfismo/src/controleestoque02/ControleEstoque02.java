package controleestoque02;

public class ControleEstoque02 {

	public static void main(String[] args) {
		Celular02 celular1 = new Celular02();
		Livro02 livro1 = new Livro02();
		
		
		celular1.setModelo("Samsung note s20");
		celular1.setCodigoBarra(123456);
		celular1.setTamanho(10.2);
		celular1.setCor("Dourado");
		celular1.liga();
		celular1.setNovo(true);
		celular1.status();
		
		System.out.println();
		
		livro1.setModelo("Ação");
		livro1.setCodigoBarra(123454);
		livro1.setTamanho(20);
		livro1.setCor("Colorido");
		livro1.setNovo(false);
		livro1.setPaginas(100);
		livro1.abrir();
		livro1.status();
	
		

	}
}
