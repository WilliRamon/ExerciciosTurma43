import java.util.Scanner;

public class Lista04Exer04 {

	public static void main(String[] args) {
		int mat[][] = new int[3][3];
		int x, y, soma=0, somaDiagonal=0;
		Scanner ler = new Scanner(System.in);
		
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				System.out.println("Digite o valor da linha " + (x+1) + " coluna " + (y+1) + ": ");
				mat[x][y] = ler.nextInt();

				soma += mat[x][y];
			}
		}
		somaDiagonal = mat[0][0] + mat[1][1] + mat[2][2];
		System.out.println("A somatória de todos os valores da matriz é: " + soma);
		System.out.println("A somatória da primeira diagonal é: " + somaDiagonal);

	}

}
