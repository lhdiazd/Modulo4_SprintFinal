package sprintModulo4;

import java.time.LocalDate;

public class Profesional extends Usuario{
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {
		SolicitadorDatos solicitador = new SolicitadorDatos();
		solicitador.solicitarDatosProfesional(this);
	}

	public Profesional(String titulo, LocalDate fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.titulo = validador.validarLongitudCampo(titulo, 10, 50) ? titulo : this.titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
		

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Fecha ingreso: " + FormateadorDatos.desplegarFechaFormateada(this.fechaIngreso));
		
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
}
