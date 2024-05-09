import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor, cont = 1;
		double fat = 1;
		
		System.out.println("Digite um valor inteiro e positivo");
		valor = in.nextInt();
		in.close();
		
		if(valor < 0) {
			System.out.println("O valor deve ser inteiro e positivo");
			
		}else {
			while (cont <= valor) {
				fat *= cont;
				cont++;
			}
			System.out.println(fat);
		}
		
	}
}
