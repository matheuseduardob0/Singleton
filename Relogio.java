package singleton;

import java.text.ParseException;

public class Relogio {

	public static String relogio;
	private Relogio() {
	}
	public static synchronized String getDataEHora() throws ParseException {
		if (relogio == null) {
			Data data = new Data();
			Hora hora = new Hora();
			relogio = data.getData() + " " + hora.getHora();
		}
		return relogio;
	}
}