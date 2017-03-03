package com.Condicionales.uno;

import java.util.Scanner;

public class Condicionales {
	static int texto;

	public static int ingreseEdad() {
		Scanner in = new Scanner(System.in);
		texto = in.nextInt();
		return texto;
	}

	public static void main(String[] args) {

		System.out.println("Ingrese edad: ");
		try {
			ingreseEdad();
		} catch (Exception holamundo) {
			System.out.println("Ingrese un numero...");
			ingreseEdad();
		}

		System.out.println("su edad es: " + texto);

		// programa que nos diga si un numero es par o impar
		int numero = 33;
		if (numero % 2 == 0) {

			System.out.println("el numero ingresado es par");
		} else {
			System.out.println("el numero ingresado es inpar");
		}

		// si un numero es divisible por diez
		if (numero % 10 == 0) {
			System.out.println("es divisible");
		} else {
			System.out.println("no es divisible");
		}

	}

}
