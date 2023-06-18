package sprintModulo4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCamposGenericos {
	public boolean estaVacio(String campo) {		
		boolean estaVacio = true;
		if (campo != null) {
			estaVacio = campo.isBlank();		
		}
		return estaVacio;		
	}
	
	public boolean validarLongitudCampo(String campo, int min, int max) {
		boolean esValido = false;
		if(!estaVacio(campo)) {
			campo = campo.trim();
			esValido = (campo.length() > max || campo.length() < min) ? false : true;				
		}		
		return esValido;
	}

	
	public boolean validarRut(String run) {			
		boolean esValido = false;
		if (!estaVacio(run)) {
			Pattern patron = Pattern.compile("^\\d{7,8}-[0-9Kk]$");
			Matcher matcher = patron.matcher(run);
			if (matcher.matches()) {
				String[] rutDividido = run.split("-");
				int rutNumerico = Integer.parseInt(rutDividido[0]);
				esValido = (rutNumerico > 999999) ? true : false;
			}
		}
		return esValido;
	}



}
