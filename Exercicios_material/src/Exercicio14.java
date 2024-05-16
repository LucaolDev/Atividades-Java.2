import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;
		double y = 0;
		System.out.println("Informe um valor inteiro e positivo: ");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			y = y + 1.0 / i;
		}
				System.out.println("y = " + y);
	}
}
