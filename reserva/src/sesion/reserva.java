package sesion;

public class Reserva {
    private static int contadorReservas = 0;
    private int idReserva;
    private String usuario;
    private String libro;
    private String fechaReserva;
  
    //constructor//
    public Reserva(Usuario usuario, Libro libro) {
        this.idReserva = ++contadorReservas;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva.now();
    }

