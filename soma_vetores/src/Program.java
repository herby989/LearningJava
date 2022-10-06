import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scan.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetorA[i] = scan.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}

		scan.close();

	}

}
