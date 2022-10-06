package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double altura = 0;
		int menos16 = 0;

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = scan.nextInt();
		Person[] vect = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			scan.next();
			String name = scan.nextLine();

			System.out.print("Idade: ");
			int age = scan.nextInt();

			System.out.print("Altura: ");
			double height = scan.nextDouble();

			vect[i] = new Person(name, age, height);

		}

// altura media		

		for (int i = 0; i < vect.length; i++) {
			altura += vect[i].getHeight();
		}
		double alturaMedia = altura / vect.length;
		System.out.printf("\nAltura média: %.2f", alturaMedia);

//Pessoas com idade menos de 16 anos

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				menos16++;

			}
		}

		double perc16 = (menos16 * 100) / vect.length;
		System.out.printf("%nPessoas com menos de 16 anos: %.1f%%", perc16);

// Imprimir na tela os nomes de possos com menos de 16 anos

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.print(vect[i].getAge());
			}

		}

		scan.close();

	}

}
