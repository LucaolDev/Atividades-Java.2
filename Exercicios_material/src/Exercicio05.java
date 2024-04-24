import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;

		System.out.println("Digite um numero: ");
		n = in.nextInt();
		in.close();
		
		switch (n % 2) {
		case 0:
			System.out.println("Pár");
			break;
		default:
			System.out.println("Impár");
		}
	}
}
