package lacoRepetcaoWhile;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		int idade = 0, maior50 = 0, menor21 = 0;
		Scanner lerScanner = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = lerScanner.nextInt();

			if (idade <= 21 && idade >= 0)
				menor21++;

			if (idade >= 50)
				maior50++;

		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas menores de 50 anos: " + maior50);

		lerScanner.close();

	}

}
