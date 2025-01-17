package programa;

public class Prestamo {

	

    private String idPrestamo;

    private Libros libro;

    private usuario usuario;

    private String fechaPrestamo;

    private String fechaDevolucion;



    // Constructor



    public Prestamo(String idPrestamo, Libros libro, usuario usuario, String fechaPrestamo ,  String fechaDevolucion) {

        this.idPrestamo = idPrestamo;

        this.libro = libro;

        this.usuario = usuario;

        this.fechaPrestamo = fechaPrestamo;

    }



    // Getters y Setters



    public String getIdPrestamo() {

        return idPrestamo;

    }



    public void setIdPrestamo(String idPrestamo) {

        this.idPrestamo = idPrestamo;

    }



    public Libros getLibro() {

        return libro;

    }



    public void setLibro(Libros libro) {

        this.libro = libro;

    }



    public usuario getUsuario() {

        return usuario;

    }



    public void setUsuario(usuario usuario) {

        this.usuario = usuario;

    }



    public String getFechaPrestamo() {

        return fechaPrestamo;

    }



    public void setFechaPrestamo(String fechaPrestamo) {

        this.fechaPrestamo = fechaPrestamo;

    }



    public String getFechaDevolucion() {

        return fechaDevolucion;

    }



    public void setFechaDevolucion(String fechaDevolucion) {

        this.fechaDevolucion = fechaDevolucion;

    }



    // Método para crear un préstamo



    public static Prestamo crearPrestamo(String idPrestamo, Libros libro, usuario usuario , String fechaPrestamo , String fechaDevolucion) {

        if (usuario.puedeRealizarPrestamo() && libro.hayCopiasDisponibles()) {

            libro.reducirCopiasDisponibles();

            usuario.añadirLibroPrestado(libro);

            return new Prestamo(idPrestamo, libro, usuario, fechaPrestamo, fechaDevolucion);

        } else{

            System.out.println("El préstamo no puede realizarse. Verifique las restricciones.");

            return null;

        }

    }



    // Método para marcar devolución

    public void marcarDevolucion() {

        libro.aumentarCopiasDisponibles();

        usuario.removerLibroPrestado(libro);

        System.out.println("Devolución completada para el libro: " + libro.getTitulo());

    }



    // Validar disponibilidad del libro

    public boolean validarDisponibilidad() {

        return libro.hayCopiasDisponibles();

    }



}