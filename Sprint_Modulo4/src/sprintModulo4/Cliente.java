package sprintModulo4;

public class Cliente extends Usuario {	
	private String apellidos;
	private String telefono;
	private String afp;
	private SistemaSalud sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Cliente() {
		SolicitadorDatos solicitador = new SolicitadorDatos();
		solicitador.solicitarDatosCliente(this);
	}

	public Cliente(String apellidos, String telefono, String afp, SistemaSalud sistemaSalud, String direccion,
			String comuna, int edad) {		
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.apellidos = validador.validarLongitudCampo(apellidos, 5, 30) ? apellidos : this.apellidos;
		
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.telefono = validador.validarLongitudCampo(telefono, 5, 30) ? telefono : this.telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.afp = (validador.validarLongitudCampo(afp, 4, 30)) ? afp : this.afp;
	}

	public SistemaSalud getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(SistemaSalud sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.direccion = validador.validarLongitudCampo(direccion, 0, 70) ? direccion : this.direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		ValidadorCamposGenericos validador = new ValidadorCamposGenericos();
		this.comuna = validador.validarLongitudCampo(comuna, 0, 50) ? comuna : this.comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = (edad >= 0 && edad < 150) ? edad : this.edad;
	}
	
	
	public String obtenerNombre() {
		return "Nombre completo: " + getNombre() + this.apellidos;
	}
	
	public SistemaSalud obtenerSistemaSalud() {
		return this.sistemaSalud;
	}
	
	@Override
	public void analizarUsuario() {		
		super.analizarUsuario();
		System.out.println("Direccion: " + this.direccion + "\n" + "Comuna: " + this.comuna);
	}

	@Override
	public String toString() {
		return "Cliente [apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud="
				+ sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}
	
	

	
}
