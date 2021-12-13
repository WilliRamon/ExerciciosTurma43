
public class Lista04Exer02 {

	public static void main(String[] args) {
		double aleatorio, soma=0, media;
		int lancamento[] = new int[10], num, x, n6=0, n5=0, n4=0;
		for(x = 0; x < lancamento.length; x++) {
			aleatorio = Math.random();
			num = (int) (1 + aleatorio * (7-1));
			lancamento[x] = num;
			
			soma += lancamento[x];
			
			if(lancamento[x] == 6) {
				n6++;
			}else if(lancamento[x] == 5) {
				n5++;
			}else if(lancamento[x] == 4) {
				n4++;
			}
			
			System.out.print(lancamento[x] + " ");
		}
		media = soma / 10;
		
		if(n6 > 0) {
			System.out.println("\nO maior numero foi o 6 e ele se repetiu " + n6 + " vezes");
		}else if(n5 > 0){
			System.out.println("\nO maior numero foi o 5 e ele se repetiu " + n5 + " vezes");
		}else {
			System.out.println("\nO maior numero foi o 4 e ele se repetiu " + n4 + " vezes");
		}
		System.out.println("A média aritimetica foi: " + media);
		
		
		



	}

}
