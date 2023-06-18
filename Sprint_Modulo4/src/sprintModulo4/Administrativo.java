package sprintModulo4;

public class Administrativo extends Usuario{
	private String area;
	private String expPrevia;
	
	public Administrativo() {
		SolicitadorDatos solicitador = new SolicitadorDatos();
		solicitador.solicitarDatosAdministrativo(this);
	}

	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.area = (validador.validarLongitudCampo(area, 5, 20)) ? area : this.area;
	}
		

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.expPrevia = (validador.validarLongitudCampo(expPrevia, 0, 100)) ? expPrevia : this.expPrevia;
	}
	

	@Override
	public void analizarUsuario() {		
		super.analizarUsuario();
		System.out.println("Area: " + this.area + "\n" + "Experiencia: " + this.expPrevia);
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}
	
	
	
}
