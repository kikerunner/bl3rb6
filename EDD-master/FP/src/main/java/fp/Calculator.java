package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	/*
	 * este metodo devuelve el Class del object que le pasamos
	 */
	public static Class classTypeOf(Object x) {
		System.out.println(x.getClass());
		return x.getClass();
	}

	/*
	 * devuelve una lista con los n números de la serie de fibonacci.
	 */
	public static List<Integer> fibonacci(int n) {
		List<Integer> listaFibonacci = new ArrayList<Integer>();
		if (n == 1)
			listaFibonacci.add(1);
		if (n > 1) {
			listaFibonacci.add(1);
			listaFibonacci.add(1);
			if (n > 2)
				for (int i = 2; i < n; i++)
					listaFibonacci.add(listaFibonacci.get(listaFibonacci.size() - 1)
							+ listaFibonacci.get(listaFibonacci.size() - 2));
		}

		return listaFibonacci;

	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		throw new NotImplementedException();
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		throw new NotImplementedException();
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena
	 * resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
	 * cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		if (fecha != "" && fecha != null) {
			String fechacorta = fecha.substring(6, 10);
			int fechica = Integer.parseInt(fechacorta);
			System.out.println(fechica);
			if (fechica % 4 == 0 && fechica % 100 != 0 || fechica % 400 == 0) {
				return true;
			}
		}
		return false;
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw new NotImplementedException();
	}
}
