import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String letra;
        
		System.out.println("Digite uma letra: ");
		letra = in.next();
		letra = letra.toLowerCase();
		in.close();
		
		switch (letra) {
		case "a", "e", "i", "o", "u":
			System.out.println("É uma vogal");
			break;
			default:
			System.out.println("Não é uma vogal");
		}
	}
}
