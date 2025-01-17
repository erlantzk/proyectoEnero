package programa;


public class reserva {

    private int idReserva;
    private usuario usuario;
    private Libros libro;
    private String fechaReserva;

    //constructor//
    public reserva(int idReserva,usuario usuario,Libros libro,String fechaReserva) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
    }

    //Metodo para crear una reserva//
    public void crearReserva() {
    	System.out.println("Reserva creada "+idReserva+" por el usuario "+usuario+" para el libro "+libro+" en la fecha "+fechaReserva+".");

    }

    //metodo lista de reservas//
	public void ListarReservas() {
	System.out.print("ID de Reserva:"+idReserva+" Usuario:"+usuario+" Libro:"+libro+" Fecha de reserva:"+fechaReserva+"."); 

	}

	//metodo liberar reserva//
	public void liberarReserva() {
		System.out.print("La reserva "+idReserva+" del usuario "+usuario+" ha sido liberada.");

	}
	
	public int getIdReserva() {
		return idReserva;

	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;

	}

}
