import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int valor, total = 0;

		System.out.println("valor inteiro e positivo: ");
		valor = in.nextInt();
		in.close();

		for (int cont = 2; cont < valor; cont++) {
			if (valor % cont == 0) {
				total++;
				break;
			}
		}
		
		System.out.println(total == 0 ? "Primo" : "Nâo é primo");
		
	}
}