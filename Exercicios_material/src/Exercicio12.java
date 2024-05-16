import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		int valor;
		
		System.out.println("valor inteiro e positivo: ");
		valor = in.nextInt();
		in.close();
		
		for(int cont = -valor; cont <= valor; cont++) {
			if (valor % cont == 0 ) {
				System.out.println(cont + " ");
			}
		}
				
	}
}
