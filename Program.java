package singleton;

import java.text.ParseException;
import javax.swing.JOptionPane;
import singleton.Relogio;
public class Program {
	public static void main(String[] args) throws ParseException {
		String relogioFinal = null;
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		JOptionPane.showMessageDialog(null, relogioFinal);
		System.out.println(relogioFinal);
	}
}
