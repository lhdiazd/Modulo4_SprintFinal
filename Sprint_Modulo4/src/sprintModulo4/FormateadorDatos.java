package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;

public class FormateadorDatos {
	public static String desplegarFechaFormateada(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}
	
	public static String desplegarHoraFormateada(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute();
	}
	
}
