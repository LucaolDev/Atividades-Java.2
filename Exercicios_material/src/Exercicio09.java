import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int cont = 1, valor, maior = Integer.MIN_VALUE;
		
		while(cont <= 15) {
			System.out.println("valor: ");
			valor = in.nextInt();
			in.close();
			
			if (valor > maior) {
				maior = valor;
			} 
			cont ++;
		}
		System.out.println("maior = " + maior);
	}

}
