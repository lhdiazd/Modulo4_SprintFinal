package sprintModulo4;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Usuario implements Asesoria{
	private String nombre;
	private LocalDate fechaNacimiento;
	private String run;
	
	public Usuario() {
		SolicitadorDatos solicitador = new SolicitadorDatos();
		solicitador.solicitarDatosUsuario(this);
	}

	public Usuario(String nombre, LocalDate fechaNacimiento, String run) {		
		setNombre(nombre);
		this.fechaNacimiento = fechaNacimiento;
		setRun(run);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.nombre = (validador.validarLongitudCampo(nombre, 5, 50)) ? nombre : this.nombre;
		
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.run = (validador.validarRut(run)) ? run : this.run;}
	
	
	
	public void mostrarEdad() {		
		Period edadUsuario = Period.between(fechaNacimiento, LocalDate.now());			
		System.out.println((fechaNacimiento != null) ? "El usuario tiene " + edadUsuario.getYears() + " años"
				: "No se ha registrado una fecha de nacimiento valida");		
	}
	
		
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + this.nombre + "\n" + "Rut: " + this.run);
	}	
	

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	
	
	
}
