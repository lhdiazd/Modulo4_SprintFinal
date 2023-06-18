package sprintModulo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {
	private List<Asesoria> asesorias;
	private List<Capacitacion> capacitaciones;
	
	public Contenedor() {
		asesorias = new ArrayList<>();
		capacitaciones = new ArrayList<>(); 
;	}
	
	public Contenedor(List<Asesoria> asesorias, List<Capacitacion> capacitaciones) {
		super();
		this.asesorias = asesorias;
		this.capacitaciones = capacitaciones;
	}

	

	public List<Asesoria> getAsesorias() {
		return asesorias;
	}

	public void setAsesorias(List<Asesoria> asesorias) {
		this.asesorias = asesorias;
	}

	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}
	
	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}
	
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);

		
	}
	
	public void eliminarUsuario(String rutUsuario) {
		Iterator<Asesoria> iterator = asesorias.iterator();
	    while (iterator.hasNext()) {
	        Asesoria asesoria = iterator.next();
	        if (asesoria instanceof Usuario) {
	            Usuario usuario = (Usuario)asesoria;
	            if (usuario.getRun().equals(rutUsuario)) {
	                iterator.remove();
	            }
	        }
	    }
	}
	
	public void agregarClienteCapacitacion(String rutUsuario, Capacitacion capacitacion) {
		Iterator<Asesoria> iterator = asesorias.iterator();
	    while (iterator.hasNext()) {
	        Asesoria asesoria = iterator.next();
	        if (asesoria instanceof Cliente) {
	           Cliente cliente = (Cliente)asesoria;
	            if (cliente.getRun().equals(rutUsuario)) {
	                capacitacion.setClienteCapacitacion(cliente);
	                System.out.println("hola");
	            }
	        }
	    }
	}
	
	public void listarUsuarios() {
		if(!asesorias.isEmpty()) {
			for (Asesoria asesoria: asesorias) {
				Usuario usuario = (Usuario)asesoria;
				System.out.println("===================");			
				System.out.println("Nombre: " + usuario.getNombre());
				System.out.println("Fecha Nacimiento: " + usuario.getFechaNacimiento().getDayOfMonth() + "/"
						+ usuario.getFechaNacimiento().getMonthValue() + "/" + usuario.getFechaNacimiento().getYear());
				System.out.println("Rut: " + usuario.getRun());
			}
		}else {
			System.out.println("No hay usuarios registrados");
		}
		
	}
	
	public void listarUsuariosPorTipo(String tipoUsuario) {
		String claseParametro = tipoUsuario.toLowerCase();
		boolean contiene = false;
		for (Asesoria asesoria: asesorias) {
			String claseObjetoLista = asesoria.getClass().getSimpleName().toLowerCase();
			if(claseParametro.equals(claseObjetoLista)) {
				System.out.println("============");
				asesoria.analizarUsuario();
				contiene = true;
			}			
		}
		if(!contiene) {
			System.out.println("\nNo existen registros de ese tipo de usuario\n");
		}	

	}
	public void listarCapacitaciones() {
		if(!capacitaciones.isEmpty()) {
			for (Capacitacion capacitacion: capacitaciones) {
				if(capacitacion.getClienteCapacitacion() == null) {
					System.out.println("Capacitacion no tiene rut asociado");
					
				} else {
					System.out.println("===================");
					System.out.println("ID De Capacitacion: " + capacitacion.getIdCapacitacion());
					System.out.println(capacitacion.mostrarDetalle());
					System.out.println("Cliente Asociado: ");
					capacitacion.getClienteCapacitacion().analizarUsuario();
				}
				
			}
		} else {
			System.out.println("No hay capacitaciones registradas");
		}
		
	}
	
}
