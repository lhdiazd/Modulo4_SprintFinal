package sprintModulo4;

import java.util.ArrayList;

public class Revision {
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalleRevision;
	private EstadoRevision estadoRevision;
	private VisitaTerreno visitaTerreno;
	
	public Revision() {}

	public Revision(int idRevision, int idVisita, String nombreRevision, String detalleRevision,
			EstadoRevision estadoRevision, VisitaTerreno visitaTerreno) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
		this.visitaTerreno = visitaTerreno;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision > 0 ? idRevision : this.idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.nombreRevision = validador.validarLongitudCampo(nombreRevision, 10, 50) ? nombreRevision : this.nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.detalleRevision = validador.validarLongitudCampo(detalleRevision, 0, 100) ? detalleRevision : this.detalleRevision;
	}

	public EstadoRevision getEstadoRevision() {
		return estadoRevision;
	}

	public void setEstadoRevision(EstadoRevision estadoRevision) {
		this.estadoRevision = estadoRevision;
	}

	public VisitaTerreno getVisitaTerreno() {
		return visitaTerreno;
	}

	public void setVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitaTerreno = visitaTerreno;
	}
	


	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalleRevision=" + detalleRevision + ", estadoRevision=" + estadoRevision + ", visitaTerreno="
				+ visitaTerreno + "]";
	}
	
	
	
}
