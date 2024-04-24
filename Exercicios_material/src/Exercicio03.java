import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i;
		
		System.out.println("Digite um numero: ");
        i = in.nextInt();
        System.out.println((i % 2 == 0) ? "Pár" : "Ímpar");
		in.close();
	}
}
