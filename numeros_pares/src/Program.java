import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		int numeroPares = 0;
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scan.nextInt();
		}

		System.out.println("\nNUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
				numeroPares++;
			}
		}

		System.out.printf("%n%nQUANTIDADE DE PARES = %d", numeroPares);
		scan.close();

	}

}
