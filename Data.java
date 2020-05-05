package singleton;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

	public static String Data;

	public Data() {

	}

	public String getData() {

		Calendar calendar = new GregorianCalendar();

		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int mes = calendar.get(Calendar.MONTH) + 1;
		int ano = calendar.get(Calendar.YEAR);

		String data = null;

		boolean validarFevereiro = false;

		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {

			validarFevereiro = true;

		}

		if (dia > 31) {

			System.out.println("Error: Dia maior que 31!");

		} else if (dia <= 0) {

			System.out.println("Error: Dia menor que 1!");

		} else if (mes > 12) {

			System.out.println("Error: Mes maior que 12!");

		} else if (mes < 01) {

			System.out.println("Error: Mes menor que 1!");

		} else if (mes == 01 || mes == 03 || mes == 05 || mes == 07 || mes == 8 || mes == 10 || mes == 12) {

			if (dia <= 31) {

				data = dia + "/" + mes + "/" + ano;

				Data = data;

			}

		} else if (mes == 04 || mes == 06 || mes == 9 || mes == 11) {

			if (dia <= 30) {

				data = dia + "/" + mes + "/" + ano;

			} else {

				System.out.println("Error: Esse mes '" + mes + "' não pode ter mais que 30 dias!");

			}

		} else if (mes == 02 || mes == 2) {

			if (validarFevereiro == true) {

				if (dia <= 29) {

					data = "ANO BISSEXTO: " + dia + "/" + mes + "/" + ano;
					Data = data;

				}

			} else if (validarFevereiro == false) {

				if (dia > 28) {

					System.out.println("Error: Mes de fevereiro não bissexto, tem somente 28 dias");
				}

			}

		}

		return Data;
	}
}

