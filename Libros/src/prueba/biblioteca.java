package prueba;

import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        usuario[] usuarios = new usuario[100]; 
        Libros[] libros = new Libros[100];
        int contadorUsuarios = 0;
        int contadorLibros = 0;
        while (true) {
            System.out.println("Sistema de Biblioteca");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Libro");
            System.out.println("3. Realizar Prestamo");
            System.out.println("4. Realizar Devolución");
            System.out.println("5. Gestionar Reserva");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Libros");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    System.out.print("Ingrese nombre del usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese ID del usuario: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese rol del usuario (estudiante/profesor/invitado): ");
                    String rol = sc.nextLine();
                    usuarios[contadorUsuarios++] = new usuario(nombre, id, rol);
                    break;
                case 2:
                    System.out.print("Ingrese título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese ID del libro: ");
                    int libroID = sc.nextInt();
                    System.out.print("Ingrese año de publicación: ");
                    int añoPublicacion = sc.nextInt();
                    System.out.print("Ingrese número de copias disponibles: ");
                    int copiasDisponibles = sc.nextInt();
                    sc.nextLine();
                    libros[contadorLibros++] = new Libros(titulo, autor, libroID, añoPublicacion, copiasDisponibles);
                    break;
                case 3:
                    System.out.print("Ingrese ID del libro para préstamo: ");
                    int idPrestamo = sc.nextInt();
                    sc.nextLine();
                    Libros libroPrestamo = null;
                    for (int i = 0; i < contadorLibros; i++) {
                        if (libros[i].id == idPrestamo) {
                            libroPrestamo = libros[i];
                            break;
                        }
                    }
                    if (libroPrestamo == null) {
                        System.out.println("Libro no encontrado.");
                    } else {
                        System.out.print("Ingrese ID del usuario que realiza el préstamo: ");
                        int idUsuario = sc.nextInt();
                        sc.nextLine(); 
                        usuario usuarioParaPrestamo = null;
                        for (int i = 0; i < contadorUsuarios; i++) {
                            if (usuarios[i].getId() == idUsuario) {
                                usuarioParaPrestamo = usuarios[i];
                                break;
                            }
                        }
                        if (usuarioParaPrestamo == null) {
                            System.out.println("Usuario no encontrado.");
                        } else {
                            Prestamo nuevoPrestamo = Prestamo.crearPrestamo(
                                    "P-" + idPrestamo, libroPrestamo, usuarioParaPrestamo, "2025-01-17", "2025-02-17");
                            if (nuevoPrestamo != null) {
                            }
                        }
                    }
                    break;
                    
                case 4:
                    System.out.print("Ingrese ID del libro para devolver: ");
                    int idDevolucion = sc.nextInt();
                    sc.nextLine();
                    Libros libroParaDevolucion = null;
                    for (int i = 0; i < contadorLibros; i++) {
                        if (libros[i].id == idDevolucion) {
                            libroParaDevolucion = libros[i];
                            break;
                        }
                    }
                    if (libroParaDevolucion == null) {
                        System.out.println("Libro no encontrado.");
                    } else {
                        System.out.print("Ingrese ID del usuario que realiza la devolución: ");
                        int UsuarioDevolucion = sc.nextInt();
                        sc.nextLine();
                        usuario usuarioParaDevolucion = null;
                        for (int i = 0; i < contadorUsuarios; i++) {
                            if (usuarios[i].getId() == UsuarioDevolucion) {
                                usuarioParaDevolucion = usuarios[i];
                                break;
                            }
                        }
                        if (usuarioParaDevolucion == null) {
                            System.out.println("Usuario no encontrado.");
                        } else {
                            Prestamo prestamoRealizado = null;
                            if (prestamoRealizado != null) {
                                prestamoRealizado.marcarDevolucion();
                            } else {
                                System.out.println("No se encontró el préstamo para devolver.");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Ingrese ID del libro para reservar: ");
                    int idReserva = sc.nextInt();
                    sc.nextLine(); 
                    Libros libroReserva = null;
                    for (int i = 0; i < contadorLibros; i++) {
                        if (libros[i].id == idReserva) {
                            libroReserva = libros[i];
                            break;
                        }
                    }
                    if (libroReserva == null) {
                        System.out.println("Libro no encontrado.");
                    } else {
                        System.out.print("Ingrese ID del usuario para la reserva: ");
                        int idUsuarioReserva = sc.nextInt();
                        sc.nextLine();
                        usuario usuarioReserva = null;
                        for (int i = 0; i < contadorUsuarios; i++) {
                            if (usuarios[i].getId() == idUsuarioReserva) {
                                usuarioReserva = usuarios[i];
                                break;
                            }
                        }
                        if (usuarioReserva == null) {
                            System.out.println("Usuario no encontrado.");
                        } else {
                            reserva nuevaReserva = new reserva(
                                    idReserva, usuarioReserva, libroReserva, "2025-01-17");
                            libroReserva.añadirReserva(nuevaReserva);
                        }
                    }
                    break;   
                case 6:
                    System.out.println("Listar Usuarios");
                    for (int i = 0; i < contadorUsuarios; i++) {
                        System.out.println(usuarios[i].getNombre() + " | ID: " + usuarios[i].getId() + " | Rol: " + usuarios[i].getRol());
                    }
                    break;
                case 7:
                    System.out.println("Listar Libros");
                    for (int i = 0; i < contadorLibros; i++) {
                        System.out.println(libros[i].getTitulo() + " | Autor: " + libros[i].autor + " | ID: " + libros[i].id + " | Copias: " + libros[i].copiasDisponibles);
                    }
                    break;
                case 8:
                    System.out.println("Saliendo, gracias por su vista");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción menú.");
            }
        }
    }
}
