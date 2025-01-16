package sesion;

public class Reserva {
    private int idReserva;
    private String usuario;
    private String libro;
    private String fechaReserva;
  
    //constructor//
    public Reserva(int idReserva,String usuario,String libro,String fechaReserva) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
    }
    //Metodo para crear una reserva//
    public void crearReserva() {
    	System.out.println("Reserva creada "+idReserva+" por el usuario "+usuario+" para el libro "+libro+" en la fecha "+fechaReserva);
    }
    //metodo lista de reservas//
	public void ListarReservas() {
	System.out.print("idReserva:"+idReserva+" Usuario:"+usuario+" Libro:"+libro+" Fecha de reserva:"+fechaReserva); 
	}
	//metodo liberar reserva//
	public void liberarReserva() {
		System.out.print("La reserva "+idReserva+" del usuario "+usuario+" ha sido liberada");
	}
}