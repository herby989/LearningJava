import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scan.nextDouble();
		}

		// MEDIA DO VETOR
		double soma = 0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		System.out.printf("%n%nMEDIA DO VETOR = %.3f", media);

		// ELEMENTOS ABAIXO DA MEDIA
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f %n", vect[i]);
			}
		}

		scan.close();

	}

}
