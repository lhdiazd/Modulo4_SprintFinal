package sprintModulo4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitadorDatos {
	public void solicitarDatosUsuario(Usuario usuario) {
		Scanner scanner = new Scanner(System.in);
		
		while(usuario.getNombre() == null) {
			System.out.println("Ingrese nombre de usuario (campo obligatorio):");
			String nombre = scanner.nextLine();
			usuario.setNombre(nombre);
		}
		
		while(usuario.getFechaNacimiento() == null) {
			try {				
				LocalDate fechaNacimiento;
				System.out.println("Ingrese año nacimiento:");
				int anio = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Ingrese mes de nacimiento:");
				int mes = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Ingrese dia de nacimiento:");
				int dia = scanner.nextInt();
				scanner.nextLine();
				fechaNacimiento = LocalDate.of(anio, mes, dia);
				usuario.setFechaNacimiento(fechaNacimiento);
				
				
			} catch (InputMismatchException e ) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}catch( DateTimeException d) {
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(usuario.getRun() == null) {
			System.out.println("Ingrese rut de usuario(campo obligatorio):");
			String run = scanner.nextLine();
			usuario.setRun(run);
		}
		
		
		
	}
	
	public void solicitarDatosAdministrativo(Administrativo administrativo) {
		solicitarDatosUsuario(administrativo);
		Scanner scanner = new Scanner(System.in);
		
		while (administrativo.getArea() == null) {
			System.out.println("Ingrese area:");
			String area = scanner.nextLine();
			administrativo.setArea(area);
		}
		
		System.out.println("Ingrese experiencia previa: ");
		String expPrevia = scanner.nextLine();
		administrativo.setArea(expPrevia);		
		
	}
	
	public void solicitarDatosCliente(Cliente cliente) {
		solicitarDatosUsuario(cliente);
		Scanner scanner = new Scanner(System.in);
		
		while(cliente.getApellidos() == null) {
			System.out.println("Ingrese apellidos(campo obligatorio):");
			String apellidos = scanner.nextLine();
			cliente.setApellidos(apellidos);
		}
		while(cliente.getTelefono() == null) {
			System.out.println("Ingrese telefono(campo obligatorio)");
			String telefono = scanner.nextLine();
			cliente.setTelefono(telefono);
		}
		
		System.out.println("Ingrese afp:");
		String afp = scanner.nextLine();
		cliente.setAfp(afp);
		
		while(cliente.getSistemaSalud() == null) {
			try {
				System.out.println("Ingrese sistema de salud: fonasa o isapre");
				String sistema = scanner.nextLine();
				SistemaSalud sistemaSalud = SistemaSalud.valueOf(sistema.toUpperCase());
				cliente.setSistemaSalud(sistemaSalud);
			} catch (IllegalArgumentException e) {
				System.out.println("Campo sistema de salud invalido");
			}
		}
		
		System.out.println("Ingrese direccion");
		String direccion = scanner.nextLine();
		cliente.setDireccion(direccion);
		
		
		System.out.println("Ingrese comuna:");
		String comuna = scanner.nextLine();
		cliente.setComuna(comuna);
		
		while(cliente.getEdad() == 0) {
			try {
				System.out.println("Ingrese edad:");
				int edad = scanner.nextInt();
				cliente.setEdad(edad);
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}
		}
		
		
		
	}
	
	public void solicitarDatosProfesional(Profesional profesional) {
		solicitarDatosUsuario(profesional);
		Scanner scanner = new Scanner(System.in);
		while(profesional.getTitulo() == null) {
			System.out.println("Ingrese titulo(campo obligatorio)");
			String titulo = scanner.nextLine();
			profesional.setTitulo(titulo);
		}
		
		while(profesional.getFechaIngreso() == null) {
			try {				
				LocalDate fechaIngreso;
				System.out.println("Ingrese año ingreso:");
				int anio = scanner.nextInt();
				scanner.nextLine();				
				System.out.println("Ingrese mes de ingreso:");
				int mes = scanner.nextInt();
				scanner.nextLine();				
				System.out.println("Ingrese dia de ingresos:");
				int dia = scanner.nextInt();
				scanner.nextLine();				
				fechaIngreso = LocalDate.of(anio, mes, dia);
				profesional.setFechaIngreso(fechaIngreso);
				
				
			} catch (InputMismatchException e ) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}catch( DateTimeException d) {
				System.out.println("Formato fecha no permitido");
			}
		}
		
	}
	
	public void solicitarDatosAccidente(Accidente accidente) {
		Scanner scanner = new Scanner(System.in);
		while(accidente.getIdAccidente() == 0) {
			try {
				System.out.println("Ingrese ID accidente:");
				int idAccidente = scanner.nextInt();
				accidente.setIdAccidente(idAccidente);
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(accidente.getFechaAccidente() == null) {
			try {				
				LocalDate fechaAccidente;
				System.out.println("Ingrese año accidente:");
				int anio = scanner.nextInt();
				scanner.nextLine();				
				System.out.println("Ingrese mes de accidente:");
				int mes = scanner.nextInt();
				scanner.nextLine();				
				System.out.println("Ingrese dia de accidente:");
				int dia = scanner.nextInt();
				scanner.nextLine();				
				fechaAccidente = LocalDate.of(anio, mes, dia);
				accidente.setFechaAccidente(fechaAccidente);
			} catch (InputMismatchException e ) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}catch( DateTimeException d) {
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(accidente.getHoraAccidente() == null) {
			try {
				LocalTime horaAccidente;
				System.out.println("Ingrese hora:");
				int hora = scanner.nextInt();
				scanner.nextLine();				
				System.out.println("Ingrese minutos");
				int minutos = scanner.nextInt();
				scanner.nextLine();				
				horaAccidente = LocalTime.of(hora, minutos);
				accidente.setHoraAccidente(horaAccidente);
			} catch (InputMismatchException e ) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}catch( DateTimeException d) {
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(accidente.getLugarAccidente() == null) {
			System.out.println("Ingresa lugar accidente:");
			String lugarAccidente = scanner.nextLine();
			accidente.setLugarAccidente(lugarAccidente);
		}
		while(accidente.getOrigenAccidente() == null) {
			System.out.println("Ingresa origen accidente:");
			String origenAccidente = scanner.nextLine();
			accidente.setOrigenAccidente(origenAccidente);
		}
		
		while(accidente.getConsecuenciasAccidente() == null) {
			System.out.println("Ingresa consecuencias accidente:");
			String consecuenciasAccidente = scanner.nextLine();
			accidente.setConsecuenciasAccidente(consecuenciasAccidente);
		}
		
		
			
	}
	
	public void solicitarDatosCapacitacion(Capacitacion capacitacion) {
		Scanner scanner = new Scanner(System.in);
		while(capacitacion.getIdCapacitacion() == 0) {
			try {
				System.out.println("Ingrese ID capacitacion:");
				int idCapacitacion = scanner.nextInt();
				capacitacion.setIdCapacitacion(idCapacitacion);
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(capacitacion.getDiaCapacitacion() == null) {
			try {
				System.out.println("Ingrese dia capacitacion: lunes a domingo");
				String dia = scanner.nextLine();
				DiaSemana diaSemana = DiaSemana.valueOf(dia.toUpperCase());
				capacitacion.setDiaCapacitacion(diaSemana);
			} catch (IllegalArgumentException e) {
				System.out.println("Campo dia semana invalido");
			}
		}
		
		while(capacitacion.getHoraCapacitacion() == null) {
			try {
				LocalTime horaCapacitacion;
				System.out.println("Ingrese hora:");
				int hora = scanner.nextInt();
				System.out.println("Ingrese minutos");
				int minutos = scanner.nextInt();
				horaCapacitacion = LocalTime.of(hora, minutos);
				capacitacion.setHoraCapacitacion(horaCapacitacion);
				scanner.nextLine();
			} catch (InputMismatchException e ) {
				scanner.nextLine();
				System.out.println("Formato fecha no permitido");
			}catch( DateTimeException d) {
				System.out.println("Formato fecha no permitido");
			}
		}
		
		while(capacitacion.getLugarCapacitacion() == null) {
			System.out.println("Ingresa lugar capacitacion:");
			String lugarCapacitacion = scanner.nextLine();
			capacitacion.setLugarCapacitacion(lugarCapacitacion);
		}
		
		while(capacitacion.getDuracionCapacitacion() == 0) {
			try {
				System.out.println("Ingrese duracion de la capacitacion:");
				int duracion = scanner.nextInt();
				capacitacion.setDuracionCapacitacion(duracion);
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Formato de campo no permitido");
			}
		}
		
		while(capacitacion.getasistentesCapacitacion() == 0) {
			try {
				System.out.println("Ingrese asistentes de la capacitacion:");
				int asistentes = scanner.nextInt();
				capacitacion.setasistentesCapacitacion(asistentes);
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Formato de campo no permitido");
			}
		}
		
		
	}
}
