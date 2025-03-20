package lacoRepeticaoFor;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {

		int contador, par = 0, impar = 0;

		for (contador = 1; contador <= 10; contador++) {

			Scanner lerScanner = new Scanner(System.in);
			System.out.println("Escreva o " + contador + "º Numero");
			int numero = lerScanner.nextInt();

			if (numero % 2 == 0) {
				par++;

			} else if (numero %2 !=0){
				impar++;
			}

		}
		System.out.println("O total de numeros pares são: " + par );
		System.out.println("O total de numeros ímpares são: " + impar );
		
		
		
		
	}
}
