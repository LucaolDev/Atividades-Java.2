import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double valor, cont = 1, resultado = 0;
		String resposta;

		while (true) {
			System.out.println("valor: ");
			valor = in.nextInt();

			while (cont != 0) {
				resultado = valor * cont;
				System.out.println(valor + " * " + cont + " = " + resultado);
				cont++;
			}
			System.out.println("Deseja outra tabuada (s/n)? ");
			resposta = in.next();
			if (resposta.equalsIgnoreCase("n")) {
				break;
			}
			cont = 1 ;
		}

	}

}
