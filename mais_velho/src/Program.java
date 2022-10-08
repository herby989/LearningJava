import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n, maisVelho,position;

		System.out.print("Quantas pessoas voce vai digitar? ");
		n = scan.nextInt();

		int[] age = new int[n];
		String[] name = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("\nNome: ");
			name[i] = scan.next();
			System.out.print("Idade: ");
			age[i] = scan.nextInt();
		}

		 maisVelho = age[0];
		 position = 0;

		for (int i = 0; i < n; i++) {
			if (age[i] > age[n - 1]) {
				maisVelho = age[i];
				position = i;
			}

		}
		
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", name[position]);

		scan.close();

	}

}
