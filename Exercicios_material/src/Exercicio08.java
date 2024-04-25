import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		int n1, n2;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite Dois numeros: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();

		
		do {
			System.out.println("Digite Dois numeros: ");
			n1 = in.nextInt();
			n2 = in.nextInt();
			if (n1 >= n2) {
				System.out.println("Valores invalidos ");
			}
			
		}while(n1 >= n2);
		
		while (n1 <= n2) {
			if (n1 % 2 == 1) {
				System.out.print(n1 + " ");
			}
			n1 = n1 + 1;
		}
	}
}