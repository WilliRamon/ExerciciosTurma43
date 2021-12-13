import java.util.Scanner;

public class Lista04Exer03 {

	public static void main(String[] args) {
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int x, y;
		Scanner ler = new Scanner(System.in);

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++) {
				System.out.print(
						"Na PRIMEIRA MATRIZ, digite um valor na linha " + (x + 1) + " na coluna " + (y + 1) + ": ");
				n1[x][y] = ler.nextInt();
				System.out.print(
						"Na SEGUNDA MATRIZ, digite um valor na linha " + (x + 1) + " na coluna " + (y + 1) + ": ");
				n2[x][y] = ler.nextInt();

				m1[x][y] = n1[x][y] + n2[x][y];
			}
		}
		System.out.println("A somatória das duas matrizes é: ");
		for(x=0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				System.out.print(m1[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println("\nA difirença das duas matrizes: ");
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				if(n1[x][y] >= n2[x][y]) {
					m2[x][y] = n1[x][y] - n2[x][y];
				}else {
					m2[x][y] = n2[x][y] - n1[x][y];
				}
				System.out.print(m2[x][y] + " ");
			}
			System.out.println();
		}

	}

}
