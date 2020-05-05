package singleton;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hora {

	public static String horas;

	public Hora() {

	}

	public String getHora() {

		Calendar calendar = new GregorianCalendar();

		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minuto = calendar.get(Calendar.MINUTE);
		int segundos = calendar.get(Calendar.SECOND);

		if (hora > 24) {

			System.out.println("Error: Um dia nao tem mais de 24 horas");

		} else if (minuto > 60) {

			System.out.println("Error: Minutos nao pode ser superior a 60");

			
		} else if (segundos > 60) {
			System.out.println("Error: Segundos nao podem ser superior a 60");
			

		} else {

			horas = hora + ":" + minuto + ":" + segundos;

		}

		return horas;

	}

}

