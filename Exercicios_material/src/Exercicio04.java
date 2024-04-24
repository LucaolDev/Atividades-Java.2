import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i;
		
		System.out.println("Digite um numero: ");
		i = in.nextInt();
		in.close();
		
		if (i % 2 == 0) {
			System.out.println("Pár");
		}else System.out.println("Impár");
		
		
	}
}
