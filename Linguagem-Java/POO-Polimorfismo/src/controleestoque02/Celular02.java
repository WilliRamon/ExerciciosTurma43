package controleestoque02;

public class Celular02 extends Produto02{
	private int carga;
	private boolean touchScreen;
	
	@Override
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Código de barra: + " + this.getCodigoBarra());
		System.out.println("Tamanho: " + this.getTamanho());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("É novo? " + this.getNovo());
	}
	
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	
	
}