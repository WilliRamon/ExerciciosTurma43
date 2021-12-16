package controleestoque02;

import java.util.ArrayList;

public class ControleEstoque02 {

	public static void main(String[] args) {
		Celular02 celular1 = new Celular02();
		Celular02 celular2 = new Celular02();
		Celular02 celular3 = new Celular02();
		Livro02 livro1 = new Livro02();
		
		
		celular1.setModelo("Samsung note s20");
		celular1.setCodigoBarra(123456);
		celular1.setTamanho(10.2);
		celular1.setCor("Dourado");
		celular1.liga();
		celular1.setNovo(true);
		
		celular2.setModelo("Iphone xpro");
		celular2.setCodigoBarra(123);
		celular2.setCor("Preto");
		
		celular3.setModelo("Motorola Moto g");
		celular3.setCodigoBarra(102030);
		celular3.setTamanho(10);
		celular3.setCor("Branco");
		celular3.liga();
		celular3.setNovo(false);
		
	
		
		System.out.println();
		
		livro1.setModelo("Ação");
		livro1.setCodigoBarra(123454);
		livro1.setTamanho(20);
		livro1.setCor("Colorido");
		livro1.setNovo(false);
		livro1.setPaginas(100);
		livro1.abrir();
		
		
		
	
		ArrayList<Produto02>  celular = new ArrayList<>();
		ArrayList<Produto02>  livro = new ArrayList<>();
		
		celular.add(celular1);
		celular.add(celular2);
		celular.add(celular3);
		celular.remove(1);
		System.out.println("Quantidade de itens: " + celular.size());
		
		livro.add(livro1);
		System.out.println("Quantidade de itens: " + livro.size());
		
		System.out.println(celular);
		System.out.println(livro);
		

	}
}
