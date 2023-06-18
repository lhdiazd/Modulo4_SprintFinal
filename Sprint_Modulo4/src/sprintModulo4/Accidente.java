package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Accidente {
	private int idAccidente;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciasAccidente;
	private ArrayList<Cliente> clienteAccidente;

	public Accidente() {
		SolicitadorDatos solicitador = new SolicitadorDatos();		
		solicitador.solicitarDatosAccidente(this);
	}

	public Accidente(int idAccidente, LocalDate fechaAccidente, LocalTime horaAccidente, String lugarAccidente,
			String origenAccidente, String consecuenciasAccidente, ArrayList<Cliente> clienteAccidente) {

		this.idAccidente = idAccidente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciasAccidente = consecuenciasAccidente;
		this.clienteAccidente = clienteAccidente;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente > 0 ? idAccidente : this.idAccidente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public LocalTime getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(LocalTime horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.lugarAccidente = (validador.validarLongitudCampo(lugarAccidente, 10, 50)) ? lugarAccidente : this.lugarAccidente;
	}

	public String getOrigenAccidente() {
		return origenAccidente;
	}

	public void setOrigenAccidente(String origenAccidente) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.origenAccidente = (validador.validarLongitudCampo(origenAccidente, 1, 100)) ? origenAccidente : this.origenAccidente;
	}

	public String getConsecuenciasAccidente() {
		return consecuenciasAccidente;
	}

	public void setConsecuenciasAccidente(String consecuenciasAccidente) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.consecuenciasAccidente = (validador.validarLongitudCampo(consecuenciasAccidente, 1, 100)) ? consecuenciasAccidente : this.consecuenciasAccidente;
	}

	public ArrayList<Cliente> getClienteAccidente() {
		return clienteAccidente;
	}

	public void setClienteAccidente(ArrayList<Cliente> clienteAccidente) {
		this.clienteAccidente = clienteAccidente;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", fechaAccidente=" + fechaAccidente + ", horaAccidente="
				+ horaAccidente + ", lugarAccidente=" + lugarAccidente + ", origenAccidente=" + origenAccidente
				+ ", consecuenciasAccidente=" + consecuenciasAccidente + ", clienteAccidente=" + clienteAccidente + "]";
	}

}
