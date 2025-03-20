package lacoRepeticaoDoWhile;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		int numeros =0, soma = 0;

		Scanner lerScanner = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numeros = lerScanner.nextInt();

			if (numeros >= 0) {
				soma = soma + numeros;

			}

		} while (numeros != 0);

		System.out.println("A soma dos números positivos é: " + soma);

		lerScanner.close();

	}

}
