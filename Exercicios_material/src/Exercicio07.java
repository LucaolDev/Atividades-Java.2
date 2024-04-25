import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		int n1, n2;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite Dois numeros: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		if (n1 < n2) {
			while (n1 <= n2) {
				if (n1 % 2 == 1) {
					System.out.print(n1 + " ");
				}
				n1 = n1 + 1;
			}
		} else
			System.out.println("O Segundo numero deve ser maior que o primeiro");
	}
}