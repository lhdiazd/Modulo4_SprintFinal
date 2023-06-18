package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor();
		Scanner scanner = new Scanner(System.in);	
		int opcion = 0;
		
		do {
			
			try {
				System.out.println("======Menu======");
				System.out.println("Eliga una opción:");
				System.out.println("1.-Almacenar cliente");
				System.out.println("2.-Almacenar profesional");
				System.out.println("3.-Almacenar administrativo");
				System.out.println("4.-Almacenar capacitacion");
				System.out.println("5.-Eliminar usuario");
				System.out.println("6.-Listar usuarios");
				System.out.println("7.-Listar usuarios por tipo");
				System.out.println("8.-Listar capacitaciones");
				System.out.println("9.-Salir");
				opcion = scanner.nextInt();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				opcion = 0;
				System.out.println("Opción inválida");
			}
			
			
			
			switch (opcion) {
			case 1:
				contenedor.almacenarCliente(new Cliente());
				System.out.println("\ncliente almacenado\n");				
				break;
			case 2:
				contenedor.almacenarProfesional(new Profesional());
				System.out.println("\nprofesional ingresado\n");
				break;
			case 3:
				contenedor.almacenarAdministrativo(new Administrativo());
				System.out.println("\nadministrativo ingresado\n");
				break;
			case 4:
				if(contenedor.getAsesorias().isEmpty()) {
					System.out.println("No hay usuarios registrados para asociar una capacitacion");
				}else {
					Capacitacion capacitacion = new Capacitacion();
					System.out.println("indique rut de cliente asociado a la capacitacion:");
					String rutCliente = scanner.nextLine();				
					contenedor.agregarClienteCapacitacion(rutCliente, capacitacion);
					contenedor.almacenarCapacitacion(capacitacion);
					System.out.println("\nCapacitacion almacenada\n");
				}
				
				break;
			case 5:
				if(contenedor.getAsesorias().isEmpty()) {
					System.out.println("No hay usuarios registrados");
				} else {
					System.out.println("indique rut de usuario a eliminar:");
					String rutUsuario = scanner.nextLine();	
					contenedor.eliminarUsuario(rutUsuario);
					System.out.println("\nUsuario eliminado\n");
				}
				
				break;
			case 6:
				contenedor.listarUsuarios();
				break;
			case 7:
				if(!contenedor.getAsesorias().isEmpty()) {
					System.out.println("Ingrese tipo de usuario a listar(cliente, administrativo, profesional");
					String tipoUsuario = scanner.nextLine();
					contenedor.listarUsuariosPorTipo(tipoUsuario);
				} else {
					System.out.println("No hay usuarios registrados");
				}
				break;
			case 8:
				contenedor.listarCapacitaciones();
			case 9:
				break;
			
			default:
				break;
			}
			
			
		}while(opcion != 9);
		
		System.out.println("Ha salido del programa");
	}

}
