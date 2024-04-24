import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String letra;

		System.out.println("Digite uma letra: ");
		letra = in.next();
		letra = letra.toLowerCase();
		in.close();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
		System.out.println("É uma vogal");
		} else
			System.out.println("Não é uma vogal");
	}
}
