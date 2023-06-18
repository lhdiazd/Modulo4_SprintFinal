package sprintModulo4;

import java.time.LocalTime;

public class Capacitacion {
	private int idCapacitacion;	
	private DiaSemana diaCapacitacion;
	private LocalTime horaCapacitacion;
	private String lugarCapacitacion;
	private int duracionCapacitacion;
	private int asistentesCapacitacion;
	private Cliente clienteCapacitacion;
	
	public Capacitacion() {
		SolicitadorDatos solicitador = new SolicitadorDatos();		
		solicitador.solicitarDatosCapacitacion(this);
	}

	public Capacitacion(int idCapacitacion, DiaSemana diaCapacitacion,
			LocalTime horaCapacitacion, String lugarCapacitacion, int duracionCapacitacion, int asistentesCapacitacion,
			Cliente clienteCapacitacion) {
		super();
		this.idCapacitacion = idCapacitacion;
		
		this.diaCapacitacion = diaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.asistentesCapacitacion = asistentesCapacitacion;
		this.clienteCapacitacion = clienteCapacitacion;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion > 0 ? idCapacitacion : this.idCapacitacion;
	}


	public DiaSemana getDiaCapacitacion() {
		return diaCapacitacion;
	}

	public void setDiaCapacitacion(DiaSemana diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}

	public LocalTime getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(LocalTime horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}

	public void setLugarCapacitacion(String lugarCapacitacion) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.lugarCapacitacion = validador.validarLongitudCampo(lugarCapacitacion, 10, 50) ? lugarCapacitacion : this.lugarCapacitacion;
	}

	public int getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(int duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion > 0 ? duracionCapacitacion : this.duracionCapacitacion;
	}

	public int getasistentesCapacitacion() {
		return asistentesCapacitacion;
	}

	public void setasistentesCapacitacion(int asistentesCapacitacion) {
		this.asistentesCapacitacion = asistentesCapacitacion > 0 ? asistentesCapacitacion : this.asistentesCapacitacion;
	}

	public Cliente getClienteCapacitacion() {
		return clienteCapacitacion;
	}

	public void setClienteCapacitacion(Cliente clienteCapacitacion) {
		this.clienteCapacitacion = clienteCapacitacion;
	}
	
	
	
	public String mostrarDetalle() {
		return String.format("La capacitación será en %s a las %s del día %s, y durará %s minutos",
				this.lugarCapacitacion, FormateadorDatos.desplegarHoraFormateada(horaCapacitacion),
				this.diaCapacitacion, this.duracionCapacitacion);
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", diaCapacitacion=" + diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion
				+ ", lugarCapacitacion=" + lugarCapacitacion + ", duracionCapacitacion=" + duracionCapacitacion
				+ ", asistentesCapacitacion=" + asistentesCapacitacion + ", clienteCapacitacion=" + clienteCapacitacion
				+ "]";
	}
	
	
}
